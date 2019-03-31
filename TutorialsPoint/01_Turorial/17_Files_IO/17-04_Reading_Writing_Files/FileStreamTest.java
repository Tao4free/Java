import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) {
        try {
            byte bWrite[] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("test.txt");
            for(int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); //write the bytes
                //System.out.println(bWrite[x]); //write the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();
            System.out.println(size);

            for(int i = 0; i < size; i++) {
                System.out.print( is.read() + " | ");
            }
            is.close();
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
