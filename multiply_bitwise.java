// Multiply using bitwise operator 
// Left shift operator --> << 2  means 2*2 = 4

import java.util.Scanner;

public class multiply_bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number for LEFT SHIFT : ");
        int m = sc.nextInt();
        System.out.print("Enter 2nd number for RIGHT SHIFT : ");
        int b = sc.nextInt();
        int Multiply = m << 4; // Here 2 * 2 so the number will be multiplied by 4
        int Multiply_b = b >> 3;
        System.out.println("The product for LEFT SHIFT is : " + Multiply);
        System.out.println("The product for RIGHT SHIFT is : " + Multiply_b);
    }
}

// OUTPUT -
// Enter 1st number for LEFT SHIFT : 4
// Enter 2nd number for RIGHT SHIFT : 16
// The product for LEFT SHIFT is : 64
// The product for RIGHT SHIFT is : 2