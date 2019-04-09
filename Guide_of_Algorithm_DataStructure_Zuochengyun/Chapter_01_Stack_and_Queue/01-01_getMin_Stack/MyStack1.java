public class MyStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public MyStack1() {
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    public void push(int newNum) {
        if(this.stackMin.isEmpty()) {
            this.stacMin.push(newNum);
        } else if (newNum <= this.getmin()) {
            this.stacMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop() {
        if(this.stackData.isEmpty()) {
            throw new RuntimeException("your stack is empty.");
        }
        int value = this.stackData.pop();
        if (value == this.getmin()) {
            this.stackMin.pop();
        }
        return value;
    }
}
