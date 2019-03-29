import java.io.File;
import java.io.FileReader;

public class FilenotFound_Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        FileReader fr = new FileReader(file);
    }
}
