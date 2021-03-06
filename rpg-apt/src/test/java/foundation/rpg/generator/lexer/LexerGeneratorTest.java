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

package foundation.rpg.generator.lexer;

import foundation.rpg.regular.RegularExpressionParser;
import org.testng.annotations.Test;

import java.io.PrintWriter;

import static foundation.rpg.generator.lexer.LexerGenerator.*;
import static java.util.Arrays.asList;

public class LexerGeneratorTest {

    private final RegularExpressionParser parser = new RegularExpressionParser();

    @Test
    public void testGenerateLexer() {
        new LexerGenerator().generateLexer("pkg", "MyLexer", asList(
                new TokenInfo("TokenTrue", "TokenTrue", parser.parseText("true"), 1),
                new TokenInfo("TokenFalse", "TokenFalse", parser.parseText("false"), 1),
                new TokenInfo("TokenThrows", "TokenThrows", parser.parseText("throws"), 1),
                new TokenInfo("TokenFinal", "TokenFinal", parser.parseText("final"), 1),
                new TokenInfo("TokenIdentifier", "TokenIdentifier", parser.parsePattern("\\i\\w*"), 0),
                new TokenInfo("TokenDouble", "TokenDouble", parser.parsePattern("\\d+[.eE]\\d+"), 0),
                new TokenInfo("TokenInteger", "TokenInteger", parser.parsePattern("\\d+"), 0),
                new TokenInfo("TokenString", "TokenString", parser.parsePattern("'([^'\\\\]|\\\\[^\\\\nrt])*'"), 0)
        ), new PrintWriter(System.out), null);
    }
}