/*    Java byte streams are used to perform input and output of 8-bit bytes. Though there are
   many classes related to byte streams but the most frequently used classes are,
   FileInputStream and FileOutputStream. Following is an example which makes use of these two
   classes to copy an input file into an output file 
*/
import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c;
            while((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if(in != null) {
                in.close();
            }
            if(out != null) {
                out.close();
            }
        }
    }
}
