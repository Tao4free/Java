package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {
    Stack stack = new Stack();

    @Test
    public void newStack_isEmpty() throws Exception {
        assertTrue(stack.isEmpty());
    }

}