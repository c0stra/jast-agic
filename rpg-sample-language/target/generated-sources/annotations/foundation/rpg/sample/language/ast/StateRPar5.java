package foundation.rpg.sample.language.ast;

import foundation.rpg.parser.UnexpectedInputException;
import foundation.rpg.parser.Named;

import java.util.Arrays;
import java.util.List;

// Generated visitor pattern based state for grammar parser.
public class StateRPar5 extends StackState<foundation.rpg.common.symbols.RPar, StackState<java.util.List<foundation.rpg.sample.language.ast.Expression>, StackState<foundation.rpg.common.symbols.LPar, StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State>>>> {

// NoStack:
// Stack:
    public StateRPar5(foundation.rpg.sample.language.ast.AstFactory factory, foundation.rpg.common.symbols.RPar node, StackState<java.util.List<foundation.rpg.sample.language.ast.Expression>, StackState<foundation.rpg.common.symbols.LPar, StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State>>> prev) {
        super(factory, node, prev);
    }


// Reduce:
    @Override
    public State visitThen(foundation.rpg.common.symbols.Then symbol) throws UnexpectedInputException {
        StackState<java.util.List<foundation.rpg.sample.language.ast.Expression>, StackState<foundation.rpg.common.symbols.LPar, StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State>>> stack1 = this.getPrev();
		StackState<foundation.rpg.common.symbols.LPar, StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State>> stack2 = stack1.getPrev();
		StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State> stack3 = stack2.getPrev();
		State stack4 = stack3.getPrev();
        return stack4.visitAtomicExpression(getFactory().is(stack3.getNode(), stack2.getNode(), stack1.getNode(), this.getNode())).visitThen(symbol);
    }

    @Override
    public State visitGt(foundation.rpg.common.symbols.Gt symbol) throws UnexpectedInputException {
        StackState<java.util.List<foundation.rpg.sample.language.ast.Expression>, StackState<foundation.rpg.common.symbols.LPar, StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State>>> stack1 = this.getPrev();
		StackState<foundation.rpg.common.symbols.LPar, StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State>> stack2 = stack1.getPrev();
		StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State> stack3 = stack2.getPrev();
		State stack4 = stack3.getPrev();
        return stack4.visitAtomicExpression(getFactory().is(stack3.getNode(), stack2.getNode(), stack1.getNode(), this.getNode())).visitGt(symbol);
    }

    @Override
    public State visitPlus(foundation.rpg.common.symbols.Plus symbol) throws UnexpectedInputException {
        StackState<java.util.List<foundation.rpg.sample.language.ast.Expression>, StackState<foundation.rpg.common.symbols.LPar, StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State>>> stack1 = this.getPrev();
		StackState<foundation.rpg.common.symbols.LPar, StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State>> stack2 = stack1.getPrev();
		StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State> stack3 = stack2.getPrev();
		State stack4 = stack3.getPrev();
        return stack4.visitAtomicExpression(getFactory().is(stack3.getNode(), stack2.getNode(), stack1.getNode(), this.getNode())).visitPlus(symbol);
    }

    @Override
    public State visitTimes(foundation.rpg.common.symbols.Times symbol) throws UnexpectedInputException {
        StackState<java.util.List<foundation.rpg.sample.language.ast.Expression>, StackState<foundation.rpg.common.symbols.LPar, StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State>>> stack1 = this.getPrev();
		StackState<foundation.rpg.common.symbols.LPar, StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State>> stack2 = stack1.getPrev();
		StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State> stack3 = stack2.getPrev();
		State stack4 = stack3.getPrev();
        return stack4.visitAtomicExpression(getFactory().is(stack3.getNode(), stack2.getNode(), stack1.getNode(), this.getNode())).visitTimes(symbol);
    }


// Shift:
// Accept:
    @Override
    public List<Object> stack() {
        StackState<java.util.List<foundation.rpg.sample.language.ast.Expression>, StackState<foundation.rpg.common.symbols.LPar, StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State>>> stack1 = this.getPrev();
		StackState<foundation.rpg.common.symbols.LPar, StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State>> stack2 = stack1.getPrev();
		StackState<foundation.rpg.sample.language.ast.Identifier, ? extends State> stack3 = stack2.getPrev();
		State stack4 = stack3.getPrev();
        return Arrays.asList(stack3.getNode(), stack2.getNode(), stack1.getNode(), this.getNode());
    }

}
