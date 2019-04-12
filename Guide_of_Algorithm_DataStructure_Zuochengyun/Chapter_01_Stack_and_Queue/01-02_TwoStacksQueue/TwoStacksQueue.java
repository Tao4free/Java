import java.util.*;

public class TwoStacksQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;

    public TwoStacksQueue() {
        this.stackPush = new Stack<Integer>();
        this.stackPop  = new Stack<Integer>();
    }

    public void add(int pushInt) {
        stackPush.push(pushInt);
    }

    public int poll() {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        } else if (stackPop.isEmpty()) {
            while(!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek() {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        } else if (stackPop.isEmpty()) {
          while(!stackPush.isEmpty()) {
              stackPop.push(stackPush.pop());
          }
        }
        return stackPop.peek();
    }

    public int pushSize() {
        return stackPush.size();
    }

    public int popSize() {
        return stackPop.size();
    }

    public void showPush() {
        System.out.println(stackPush);
    }

    public void showPop() {
        System.out.println(stackPop);
    }
}
