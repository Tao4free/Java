import java.util.*;

public class DateDemo {
        public static void main(String[] args) {
            // Instantiate a Date object
            Date date = new Date();

            // Display time and date
            String str = String.format("Current Date/Time : %tc", date);

            System.out.println(str);

            // Display time and date
            System.out.printf("%1$s %2$tB %2$td %2$tY\n", "Due date:", date);

            // Display time and date
            System.out.printf("%s %tB %<te %<tY\n", "Due date:", date);
        }
}
