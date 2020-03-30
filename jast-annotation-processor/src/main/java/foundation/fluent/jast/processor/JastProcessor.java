/*
 * BSD 2-Clause License
 *
 * Copyright (c) 2020, Ondrej Fischer
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package foundation.fluent.jast.processor;

import foundation.fluent.jast.StartSymbol;
import foundation.fluent.jast.parser.generator.LrParser;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import java.util.Set;
import java.util.function.Consumer;

import static foundation.fluent.jast.parser.generator.Generator.generateParser;

@SupportedAnnotationTypes("foundation.fluent.jast.StartSymbol")
public class JastProcessor extends AbstractProcessor implements Consumer<ExecutableElement> {

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        roundEnv.getElementsAnnotatedWith(StartSymbol.class).stream().map(ExecutableElement.class::cast).forEach(this);
        return true;
    }

    @Override
    public void accept(ExecutableElement element) {
        try {
            ClassToGrammarContext context = new ClassToGrammarContext(element);
            System.out.println("Grammar generated from class: " + element.getEnclosingElement());
            System.out.println(context.getGrammar());
            System.out.println();
            System.out.println();
            LrParser parser = generateParser(context.getGrammar());
            System.out.println("Parser description generated from grammar:\n\n");
            System.out.println(parser);
            System.out.println();
            System.out.println();
            new JastGenerator(processingEnv.getFiler(), context).generateSources(parser);
        } catch (RuntimeException | Error e) {
            e.printStackTrace();
        }
    }

}