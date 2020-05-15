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

Bs1: {
	Node -> Bs • Character [End, LPar, Character, Bs, Dot, LBr, Pipe, Times, Plus]
	Node -> Bs • Bs [End, LPar, Character, Bs, Dot, LBr, Pipe, Times, Plus]
	Node -> Bs • Dot [End, LPar, Character, Bs, Dot, LBr, Pipe, Times, Plus]
}

*/

import foundation.rpg.parser.UnexpectedInputException;
import javax.annotation.Generated;

@Generated("Generated visitor pattern based state for grammar parser.")
public class StateBs1 extends StackState<foundation.rpg.common.Bs, State> {
// Stack:
    public StateBs1(foundation.rpg.common.Bs node, State prev) {
        super(node, prev);
    }


// Reduce:
// Shift:
    @Override
    public State visitCharacter(java.lang.Character symbol) {
        return new StateCharacter2(symbol, this);
    }

    @Override
    public State visitBs(foundation.rpg.common.Bs symbol) {
        return new StateBs2(symbol, this);
    }

    @Override
    public State visitDot(foundation.rpg.common.Dot symbol) {
        return new StateDot2(symbol, this);
    }


// Accept:
}
