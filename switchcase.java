
// Switch case
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        switch (m) {
            case 1:
                System.out.println("This is 1");
                break;
            case 2:
                System.out.println("This is 2");
                break;
            case 3:
                System.out.println("This is 3");
                break;
            default:
                System.out.println("NOTHING");
                break;
        }
    }
}
