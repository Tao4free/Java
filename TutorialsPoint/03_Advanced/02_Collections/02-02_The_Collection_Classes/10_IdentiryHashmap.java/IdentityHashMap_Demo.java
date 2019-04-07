import java.util.*;

public class IdentityHashMap_Demo {
    public static void main(String[] args) {
        // Create a hash map
        IdentityHashMap lhm = new IdentityHashMap();

        // Put elements to the map
        lhm.put("Zara",   new Double(34343.34));
        lhm.put("Mahnaz", new Double(123.12));
        lhm.put("Ayan",   new Double(1378.00));
        lhm.put("Daisy",  new Double(99.22));
        lhm.put("Qadir",  new Double(-19.08));

        // Gte a set of the entries
        Set set = lhm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        // Deposit 1000 into Zara's account
        double balance = ((Double)lhm.get("Zara")).doubleValue();
        lhm.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " + lhm.get("Zara"));
    }
}
