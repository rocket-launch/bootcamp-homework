import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total amount of money leased:");
        double totalLeasedMoney = Double.parseDouble(input.nextLine());
        System.out.println("Enter the down payment amount:");
        double downPayment = Double.parseDouble(input.nextLine());
        System.out.println("How many months is the lease?:");
        int monthsLeaseTerm = Integer.parseInt(input.nextLine());
        System.out.println("Enter the interest rate percentage:");
        double interestRate = Double.parseDouble(input.nextLine());

        double monthlyPayment = ((totalLeasedMoney - downPayment) + ((totalLeasedMoney - downPayment) * (interestRate / 100))) / monthsLeaseTerm;
        System.out.printf("\nThe monthly payment is: %.2f", monthlyPayment);



    }
}