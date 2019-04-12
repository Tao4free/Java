import java.util.*;

public class MyStack2 {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack2() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum) {
        if(this.stackMin.isEmpty()) {
            this.stackMin.push(newNum);
        } else if (newNum <= this.getmin()) {
            this.stackMin.push(newNum);
        } else {
            this.stackMin.push(this.getmin());
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if(this.stackData.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        int value = this.stackData.pop();
        this.stackMin.pop();
        return value;
    }

    public int getmin() {
        if(this.stackMin.isEmpty()) {
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }

    public int datasize() {
        return this.stackData.size();
    }

    public int minsize() {
        return this.stackMin.size();
    }

    public void showData() {
        System.out.println(stackData);
    }

    public void showMin() {
        System.out.println(stackMin);
    }
}
