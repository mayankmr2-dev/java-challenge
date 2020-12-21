
// Arrays in java
import java.util.Scanner;
import java.util.Arrays;

public class arraytut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 12, 3, 5, 4, 6, 7 };
        int[] arrayInput = new int[10];
        int[][] multi = { { 10, 22 }, { 1, 2 }, { 22, 66, 6 } };

        for (int element : arr) {
            // System.out.println("Array element of " + i + " is : " + arr[i]);
            System.out.println("The element is : " + element);

        }

        // for (int j = 0; j < arrayInput.length; j++) {
        // System.out.print("Enter the number : ");
        // arrayInput[j] = sc.nextInt();
        // }

        System.out.println(Arrays.toString(arr)); // [12, 3, 5, 4, 6, 7]
        System.out.println(Arrays.deepToString(multi)); // [[10, 22], [1, 2], [22, 66, 6]]
    }
}
