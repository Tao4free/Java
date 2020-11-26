import java.time.*;
// import org.joda.time.Instant;

public class TestInstant{

     public static void main(String []args){
        // Instant now = Instant.now().plusMillis(TimeUnit.HOURS.toMillis(8));
        Instant now = Instant.now();
        ZonedDateTime jpnow = now.atZone(ZoneId.of("Asia/Tokyo"));

        // System.out.println("now:"+now+"\n now(timezone):"+ZonedDateTime.now());
        System.out.println("now  :"+now+"\n jpnow:"+jpnow);
     }
}
