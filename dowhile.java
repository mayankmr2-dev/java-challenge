import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int x;
        do {
            System.out.println("Guess the number : ");
            x = sc.nextInt();
            // count++;
        } while (x != 10);
        System.out.println("You guessed in " + count + " attempts.");
    }
}
