
import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("Please enter a positive three-digit number.");
        } else {
            int original = num;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit * digit * digit;
                num = num / 10;
            }

            if (sum == original) {
                System.out.println("Armstrong number");
            } else {
                System.out.println("Not an Armstrong number");
            }
        }

        sc.close();
    }
}
