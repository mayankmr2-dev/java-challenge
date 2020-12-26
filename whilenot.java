import java.util.Scanner;

public class whilenot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ---> ");
        int x = sc.nextInt();
        int count = 1;
        while (x != 10) {
            System.out.println("NOT 10 !");
            System.out.println("Enter number again ----> ");
            x = sc.nextInt();
            count++;
        }
        System.out.println("You did it in " + count + " attempts.");
    }
}
