public class ReturnArray {
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0, j = result.length - 1; i < array.length; i++, j--) {
            result[j] = array[i];
        }
        return result; 
    }

    public static void printArray2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        int[] list = new int[] {9, 6, 8, 2, 3, 5};
        printArray2(list);
        list = reverse(list);
        printArray2(list);
    }
}
