// Point class - change value of one other will change as well
// you are referring to the same address

import java.awt.*;

public class point {
    public static void main(String[] args) {
        Point point1 = new Point(2, 3);
        Point point2 = point1;
        point1.x = 44;
        System.out.println("Point 1 ----> " + point1);
        System.out.println("Point 2 ----> " + point2);
        System.out.println(point2.x);
    }
}
