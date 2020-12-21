// If else Grading 

import java.util.*;

public class gradingifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int a = sc.nextInt();
        if (a > 90) {
            System.out.println("HE HAS GOT A GRADE !");
        } else if (a < 90 && a > 80) {
            System.out.println("HE HAS GOT B GRADE !");
        } else if (a < 80 && a > 70) {
            System.out.println("HE HAS GOT C GRADE !");
        } else {
            System.out.println("HE HAS GOT A D !");
        }

    }
}
