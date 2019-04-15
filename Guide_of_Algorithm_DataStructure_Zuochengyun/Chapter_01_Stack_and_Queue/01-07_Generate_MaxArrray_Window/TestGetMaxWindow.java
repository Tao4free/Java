import java.util.*;

public class TestGetMaxWindow {
    public static void main(String[] args) {
        int[] arr = {4,3,5,4,3,3,6,7};

        System.out.println(Arrays.toString(arr));

        GetMaxWindow gmw = new GetMaxWindow();

        int[] res = gmw.get(arr,3);
        System.out.println(Arrays.toString(res));
    }
}
