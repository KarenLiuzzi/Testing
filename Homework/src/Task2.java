import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Task2 {
    public static void start() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("############### Monthly payment of a lease ###############");
        int totalLeasedMoney = -1;
        do {
            System.out.println("Total Leased Money (Greater than 49$): ");
            totalLeasedMoney = scanner.nextInt();
            if (totalLeasedMoney <= 49) {
                System.out.println("Total Leased Money should be greater than 49$. Try again!");
            };
        } while (totalLeasedMoney <= 49);

        int downPayment = -1;
        do {
            System.out.println("Down Payment (Greater than 9$ and lower than Total Leased Money): ");
            downPayment = scanner.nextInt();
            if (downPayment <= 9 || downPayment >= totalLeasedMoney) {
                System.out.println("Down Payment should be greater than 0 and lower than Total Leased Money. Try again!");
            };
        } while (downPayment <= 9 || downPayment >= totalLeasedMoney);

        int monthsLeaseTerm = -1;
        do {
            System.out.println("Months Lease Term (Between 1 and 12): ");
            monthsLeaseTerm = scanner.nextInt();
            if (monthsLeaseTerm <= 0 || monthsLeaseTerm > 12) {
                System.out.println("Months Lease should be between 1 and 12. Try again!");
            };
        } while (monthsLeaseTerm <= 0 || monthsLeaseTerm > 12);

        float interestRate = 0;
        do {
            System.out.println("Interested Rate (Between 1 and 100): ");
            interestRate = scanner.nextFloat();
            if (interestRate <= 0 || interestRate > 100) {
                System.out.println("Interested Rate should be between 1 and 100. Try again!");
            };
        } while (interestRate <= 0 || interestRate > 100);

        float monthlyPayment = (
                (totalLeasedMoney - downPayment)
                        + ((totalLeasedMoney - downPayment) * (interestRate / 100))
                ) / monthsLeaseTerm;

        NumberFormat formatDollars = NumberFormat.getCurrencyInstance(Locale.US);
        String finalResult = formatDollars.format(monthlyPayment);

        System.out.println("Monthly Payment: " + finalResult);
        System.out.println("\n");
    }
}
