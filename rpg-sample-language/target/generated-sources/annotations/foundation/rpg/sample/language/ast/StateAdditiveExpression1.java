package foundation.rpg.sample.language.ast;

import foundation.rpg.parser.UnexpectedInputException;
import foundation.rpg.parser.Named;

import java.util.Arrays;
import java.util.List;

// Generated visitor pattern based state for grammar parser.
public class StateAdditiveExpression1 extends StackState<foundation.rpg.sample.language.ast.Expression, State> {

// NoStack:
// Stack:
    public StateAdditiveExpression1(foundation.rpg.sample.language.ast.AstFactory factory, foundation.rpg.sample.language.ast.Expression node, State prev) {
        super(factory, node, prev);
    }


// Reduce:
    @Override
    public State visitSemicolon(foundation.rpg.common.symbols.Semicolon symbol) throws UnexpectedInputException {
        State stack1 = this.getPrev();
        return stack1.visitRelationalExpression((this.getNode())).visitSemicolon(symbol);
    }

    @Override
    public State visitGt(foundation.rpg.common.symbols.Gt symbol) throws UnexpectedInputException {
        State stack1 = this.getPrev();
        return stack1.visitRelationalExpression((this.getNode())).visitGt(symbol);
    }


// Shift:
    @Override
    public State visitPlus(foundation.rpg.common.symbols.Plus symbol) {
        return new StatePlus1(getFactory(), symbol, this);
    }


// Accept:
    @Override
    public List<Object> stack() {
        State stack1 = this.getPrev();
        return Arrays.asList(this.getNode());
    }

}
