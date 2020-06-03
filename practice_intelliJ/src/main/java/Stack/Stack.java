package stack;

public class Stack {

    private int size;
    private int element;

    public boolean isEmpty() {
        return size == 0;
    }

    public void push (int element) {
        size++;
    }

    public int pop() {
        --size;
        return element;
    }
}
