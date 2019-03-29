public class ExcepTest {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            for(int i = 0; i < a.length; i++) {
                System.out.println("Access element " + i + " :" + a[i]);
            }
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown *" + e);
        }
    }
}
