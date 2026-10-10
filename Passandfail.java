import java.util.Scanner;
public class Passandfail {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1 (out of 100): ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of subject 2 (out of 100): ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of subject 3 (out of 100): ");
        int m3 = sc.nextInt();

        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100
                || m3 < 0 || m3 > 100) {
            System.out.println("Invalid marks!");
        } else {
            int total = m1 + m2 + m3;
            double percentage = total / 3.0;

            System.out.println("Total Marks: " + total + "/300");
            System.out.println("Percentage: " + percentage + "%");

            if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }
        }

        sc.close();
    }
}
