// Following example illustrates how to find a digit string from the given alphanumeric string

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args) {
        // String to be scanned to find the pattern.
        String line = "If x=30, then put y to the end of the No.7 road. Are you okay?";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object
        Matcher m = r.matcher(line);
        System.out.println("Result of groupCount: " + m.groupCount());
        if(m.find()) {
            //System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }
}
