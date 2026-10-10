import java.util.Scanner;
public class income_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual income: ");
        double income = sc.nextDouble();

        double tax;

        if (income < 0) {
            System.out.println("Invalid income.");
        } else {
            if (income <= 250000) {
                tax = 0;
            } else if (income <= 500000) {
                tax = income * 0.05;
            } else if (income <= 1000000) {
                tax = income * 0.20;
            } else {
                tax = income * 0.30;
            }

            System.out.println("Annual Income: " + income);
            System.out.println("Tax Amount: " + tax);
        }

        sc.close();
    }
}
