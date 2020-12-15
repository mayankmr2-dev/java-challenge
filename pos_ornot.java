// Check if number is positive or negative

import java.util.Scanner;

public class pos_ornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if (n >= 0) {
            System.out.println("The number is positive number.");
        } else {
            System.out.println("The number is negative number.");
        }
    }
}

// OUTPUT -

// Enter the number :
// 0
// The number is positive number.

// Enter the number :
// -1
// The number is negative number.

// Enter the number :
// 55
// The number is positive number.
