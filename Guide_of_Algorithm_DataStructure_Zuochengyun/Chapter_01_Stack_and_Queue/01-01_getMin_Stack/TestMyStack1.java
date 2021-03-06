import java.util.*;

public class TestMyStack1 {
    public static void main(String[] args) {
        MyStack1 ms = new MyStack1();

        int[] list = {3,4,5,1,2,1};
        //System.out.println(list.length);

        for (int i = 0; i < list.length; i++) {
            ms.push(list[i]);
            //int vmin  = ms.getmin();
            //System.out.println("min: " + vmin);
        }
            
        showStack(ms);

        for (int i = 0; i < list.length; i++) {
            int vmin  = ms.getmin();
            int value = ms.pop();
            showStack(ms);
        }
    }

    public static void showStack(MyStack1 ms) {
        System.out.println("DataStack size: " + ms.datasize());
        ms.showData();
        System.out.println("MinStack size: " + ms.minsize());
        ms.showMin();
        System.out.println();
    }
}
