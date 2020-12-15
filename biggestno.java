
// Biggest of three number
import java.util.Scanner;

public class biggestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number : ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + "-->A is biggest");
        } else if (b >= a && b >= c) {
            System.out.println(b + "-->B is biggest");
        } else {
            System.out.println(c + "-->C is biggest");
        }

    }
}

// OUTPUT -
// Enter the first number :
// 12
// Enter the second number :
// 12
// Enter the third number :
// 44
// 44-->C is biggest

// Enter the first number :
// 11
// Enter the second number :
// 44
// Enter the third number :
// 1
// 44-->B is biggest

// Enter the first number :
// 12
// Enter the second number :
// 33
// Enter the third number :
// 14
// 33-->B is biggest