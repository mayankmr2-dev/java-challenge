import java.util.*;

public class list {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(1);
        arr1.add(2);
        arr1.set(0, 44);
        arr1.add(25);
        arr1.add(-1);
        // arr1.clear();
        System.out.println(arr1.get(0));
        System.out.println(arr1.size());
        System.out.println(arr1.subList(1, 4));
        System.out.println(arr1);
        System.out.println(arr1.remove(1));
        System.out.println(arr1);
    }
}
