public class PassArray {
    public static void printArray1() {
        int[] array = {3, 1, 2, 6, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print('\n');
    }

    public static void printArray2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        printArray1();
        printArray2(new int[] {9, 6, 8, 2, 3, 5});
    }
}
