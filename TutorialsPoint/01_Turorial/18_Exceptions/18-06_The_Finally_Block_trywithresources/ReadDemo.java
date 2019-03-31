import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
    public static void main(String[] args) {
        FileReader fr = null;

        try {
            File file = new File("input.txt");
            fr = new FileReader(file); char[] a = new char[50];
            fr.read(a); // reads the contents to the array
            for(char c:a) {
                System.out.print(c); // prints the characters one by one
            } 
        }catch (IOException e ) {
            e.printStackTrace();
        } finally {
            try{
                fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println('\n');

        try (FileReader fr2 = new FileReader("input.txt")) {
            char[] b = new char[50];
            fr2.read(b);
            for(char c:b) {
                System.out.print(c); // prints the characters one by one
            } 
        }catch (IOException e ) {
            e.printStackTrace();
        }

    }
}
