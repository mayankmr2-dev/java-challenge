import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("Name", "Mayan");
        m.put("Age", 22);
        m.put(3, 234);
        m.put("Zebra", "Animal");
        m.put(-1, "WOW");
        m.remove(-1);
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m);
    }
}
