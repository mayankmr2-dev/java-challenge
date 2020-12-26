import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;

public class buffermem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the times you want to enter numbers : ");
        int times = sc.nextInt(); // 5\n \n = buffermemory
        sc.nextLine(); // this will store the \n
        // Suppose times = 5
        String[] array = new String[times];
        for (int i = 0; i < array.length; i++) {
            int ch = i + 1;
            System.out.print("Enter name " + ch + " : ");
            array[i] = sc.nextLine();
        }

        System.out.println("Final Array is : ");
        System.out.println(Arrays.toString(array));
    }

}
