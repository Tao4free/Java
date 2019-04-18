import java.util.*;

public class SubArrayLessNum {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 3, 6, 5, 1, 2};
        int   num = 3;

        System.out.println("Given array:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Number of subarray (max - min <= " + num + "):");
        System.out.println(getNum(arr, num));
    }

    public static int getNum(int[] arr, int num) {
        if(arr == null || arr.length == 0) {
            return 0;
        }

        LinkedList<Integer> qmin = new LinkedList<Integer>();
        LinkedList<Integer> qmax = new LinkedList<Integer>();
        int   i = 0;
        int   j = 0;
        int res = 0;
        while (i < arr.length) {
            while (j < arr.length) {
                while (!qmin.isEmpty() && arr[qmin.peek()] >= arr[j]) {
                    qmin.pollLast();
                }
                qmin.addLast(j);

                while (!qmax.isEmpty() && arr[qmax.peek()] <= arr[j]) {
                    qmax.pollLast();
                }
                qmax.addLast(j);

                if (arr[qmax.getFirst()] - arr[qmin.getFirst()] > num) {
                    break;
                }
                j++;
            }

            if (qmin.peekFirst() == i) {
                qmin.pollFirst();
            }
            if (qmax.peekFirst() == i) {
                qmax.pollFirst();
            }

            res += j - i;
            i++;
        }
        return res;
    }
}
