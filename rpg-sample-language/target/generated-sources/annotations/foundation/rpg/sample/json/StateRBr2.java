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

package foundation.rpg.sample.json;

/*

RBr2: {
	Object -> LBr ListOfObject RBr • [End]
}

*/

import foundation.rpg.parser.UnexpectedInputException;
import javax.annotation.Generated;

@Generated("Generated visitor pattern based state for grammar parser.")
public class StateRBr2 extends StackState<foundation.rpg.common.RBr, StackState<java.util.List<java.lang.Object>, StackState<foundation.rpg.common.LBr, ? extends State>>> {
// Stack:
    public StateRBr2(foundation.rpg.common.RBr node, StackState<java.util.List<java.lang.Object>, StackState<foundation.rpg.common.LBr, ? extends State>> prev) {
        super(node, prev);
    }


// Reduce:
    @Override
    public State visitEnd(foundation.rpg.parser.End symbol) throws UnexpectedInputException {
        
		StackState<java.util.List<java.lang.Object>, StackState<foundation.rpg.common.LBr, ? extends State>> stack1 = this.getPrev();
		StackState<foundation.rpg.common.LBr, ? extends State> stack2 = stack1.getPrev();
		State stack3 = stack2.getPrev();
        return stack3.visitObject(foundation.rpg.sample.json.JsonFactory.is(stack2.getNode(), stack1.getNode(), this.getNode())).visitEnd(symbol);
    }


// Shift:
// Accept:
}