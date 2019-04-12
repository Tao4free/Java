import java.util.*;

public class TestTwoStacksQueue {
    public static void main(String[] args) {
        TwoStacksQueue tsq = new TwoStacksQueue();

        int[] list = {3,4,5,7,2,1};

        for (int i = 0; i < list.length; i++) {
            tsq.add(list[i]);
        }
            
        System.out.println("Initial queue parts after add: ");
        showQueue(tsq);

        System.out.println("Poll from queue: " + tsq.poll());
        showQueue(tsq);

        System.out.println("Peek of queue: " + tsq.peek());

        tsq.add(new Integer(10));
        showQueue(tsq);

        int loop = tsq.popSize();
        for (int i = 0; i < loop; i++ ) {
            System.out.println("Poll from queue: " + tsq.poll());
            showQueue(tsq);
        }

        System.out.println("Peek of queue: " + tsq.peek());

        System.out.println("Poll from queue: " + tsq.poll());
        showQueue(tsq);
        //System.out.println("Poll from queue: " + tsq.poll());
        //showQueue(tsq);
        
        System.out.println("    ***********************************************************************");
        System.out.println("    Life is like a stack you put soomething in and then pull something out."); 
        System.out.println("    Try to treat every push and pull seriously.");
        System.out.println("    Because sometimes you don't know whether next stack is empty or not.");
        System.out.println("    ***********************************************************************");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void showQueue(TwoStacksQueue tsq) {
        System.out.println("  In queue stackPush size: " + tsq.pushSize());
        System.out.print("    ");
        tsq.showPush();
        System.out.println("  In queue stackPop size: " + tsq.popSize());
        System.out.print("    ");
        tsq.showPop();
        System.out.println();
    }
}
