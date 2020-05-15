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

package foundation.rpg.lexer.regular;

/*

LPar1: {
	Node -> LPar • Pattern RPar [End, LPar, Character, Bs, Dot, LBr, Pipe, Times, Plus]
	Pattern -> • [RPar]
	Pattern -> • ListOfChain [RPar]
	ListOfChain -> • Chain [RPar, Pipe]
	ListOfChain -> • ListOfChain Pipe Chain [RPar, Pipe]
	Chain -> • ListOfNode [RPar, Pipe]
	ListOfNode -> • [RPar, LPar, Character, Bs, Dot, LBr, Pipe]
	ListOfNode -> • ListOfNode Node [RPar, LPar, Character, Bs, Dot, LBr, Pipe]
}

*/

import foundation.rpg.parser.UnexpectedInputException;
import javax.annotation.Generated;

@Generated("Generated visitor pattern based state for grammar parser.")
public class StateLPar1 extends StackState<foundation.rpg.common.LPar, State> {
// Stack:
    public StateLPar1(foundation.rpg.common.LPar node, State prev) {
        super(node, prev);
    }


// Reduce:
    @Override
    public State visitRPar(foundation.rpg.common.RPar symbol) throws UnexpectedInputException {
        
        return this.visitListOfNode(foundation.rpg.common.ListRules.isList1()).visitRPar(symbol);
    }

    @Override
    public State visitLPar(foundation.rpg.common.LPar symbol) throws UnexpectedInputException {
        
        return this.visitListOfNode(foundation.rpg.common.ListRules.isList1()).visitLPar(symbol);
    }

    @Override
    public State visitCharacter(java.lang.Character symbol) throws UnexpectedInputException {
        
        return this.visitListOfNode(foundation.rpg.common.ListRules.isList1()).visitCharacter(symbol);
    }

    @Override
    public State visitBs(foundation.rpg.common.Bs symbol) throws UnexpectedInputException {
        
        return this.visitListOfNode(foundation.rpg.common.ListRules.isList1()).visitBs(symbol);
    }

    @Override
    public State visitDot(foundation.rpg.common.Dot symbol) throws UnexpectedInputException {
        
        return this.visitListOfNode(foundation.rpg.common.ListRules.isList1()).visitDot(symbol);
    }

    @Override
    public State visitLBr(foundation.rpg.common.LBr symbol) throws UnexpectedInputException {
        
        return this.visitListOfNode(foundation.rpg.common.ListRules.isList1()).visitLBr(symbol);
    }

    @Override
    public State visitPipe(foundation.rpg.common.Pipe symbol) throws UnexpectedInputException {
        
        return this.visitListOfNode(foundation.rpg.common.ListRules.isList1()).visitPipe(symbol);
    }


// Shift:
    @Override
    public State visitPattern(foundation.rpg.lexer.regular.ast.Pattern symbol) {
        return new StatePattern2(symbol, this);
    }

    @Override
    public State visitListOfChain(java.util.List<foundation.rpg.lexer.regular.ast.Chain> symbol) {
        return new StateListOfChain2(symbol, this);
    }

    @Override
    public State visitChain(foundation.rpg.lexer.regular.ast.Chain symbol) {
        return new StateChain3(symbol, this);
    }

    @Override
    public State visitListOfNode(java.util.List<foundation.rpg.lexer.regular.ast.Node> symbol) {
        return new StateListOfNode3(symbol, this);
    }


// Accept:
}
