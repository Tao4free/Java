import java.io.File;

public class CreateDir {
    public static void main(String[] args) {
        String dirname = "./temp/tao4free/java/bin";
        File d = new File(dirname);

        // Create directory now
        d.mkdirs();
    }
}