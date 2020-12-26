// count no. of occurences of characters and store it in HASHMAP.

import java.util.*;

public class occuring {
    public static void main(String[] args) {
        Map m = new HashMap();
        String s = "This is the way !";
        for (char x : s.toCharArray()) {
            if (m.containsKey(x)) {
                int value = (int) m.get(x); // getting the value of x
                m.put(x, value + 1);
            } else
                m.put(x, 1);
        }
        m.remove(' ');
        System.out.println(m);
    }
}

// OUTPUT -
// {a=1, !=1, s=2, T=1, t=1, e=1, w=1, h=2, i=2, y=1}