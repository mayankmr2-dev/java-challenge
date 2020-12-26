import java.util.*;

// HashSet , LinkedHashSet , TreeSet(ordered/Ascending order)

public class set {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(55);
        set1.add(23);
        set1.add(-1);
        set1.add(11);
        set1.add(-8);
        // set1.remove(2);
        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println(set1.isEmpty());
    }
}
