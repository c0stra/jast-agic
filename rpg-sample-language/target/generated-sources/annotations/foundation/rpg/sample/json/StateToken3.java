package foundation.rpg.sample.json;

import foundation.rpg.parser.UnexpectedInputException;
import foundation.rpg.parser.Named;

import java.util.Arrays;
import java.util.List;

// Generated visitor pattern based state for grammar parser.
public class StateToken3 extends StackState<foundation.rpg.parser.Token, State> {

// NoStack:
// Stack:
    public StateToken3(foundation.rpg.sample.json.JsonFactory factory, foundation.rpg.parser.Token node, State prev) {
        super(factory, node, prev);
    }


// Reduce:
    @Override
    public State visitColon(foundation.rpg.common.symbols.Colon symbol) throws UnexpectedInputException {
        State stack1 = this.getPrev();
        return stack1.visitString(getFactory().isId2(this.getNode())).visitColon(symbol);
    }


// Shift:
// Accept:
    @Override
    public List<Object> stack() {
        State stack1 = this.getPrev();
        return Arrays.asList(this.getNode());
    }

}
