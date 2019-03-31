import java.io.File;

public class ReadDir {
    public static void main(String[] args) {
        File file = null;
        String[] paths;

        try {
            // Create new file object
            file = new File("../../");

            //Array of files and directory
            paths = file.list();

            // FOr each name in the path array
            for(String path:paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
