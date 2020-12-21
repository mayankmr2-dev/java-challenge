import java.util.Arrays;
import java.util.Scanner;

public class namesarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the name " + i + " : ");
            names[i] = sc.nextLine(); // next()
        }

        System.out.println(Arrays.toString(names));

        int count = 0;
        for (String element : names) {
            if (element.equals("Siplu")) {
                System.out.println("We found your guy !");
                System.out.println("He was hindering at " + count);
                break;
            }
            count++;
        }
    }
}
