import java.util.Date;
public class DateDemo {
    public static void main(String[] args) {
        // Instantiate a Date object
        Date date = new Date();

        // Display time and date using toString()
        System.out.println(date.toString());
        System.out.println(date.getTime());
        //System.out.println(new Date(2019,3,26).after(new Date(92,1,26)));
        System.out.println(date.after(new Date(92,1,26)));
    }
}
