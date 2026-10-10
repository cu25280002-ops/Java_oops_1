import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean prime = num >= 2;

        for (int i = 2; i <= num / i && prime; i++) {
            if (num % i == 0) {
                prime = false;
            }
        }

        if (prime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

        sc.close();
    }
}
