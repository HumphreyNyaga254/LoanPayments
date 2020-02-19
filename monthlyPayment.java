import java.util.Scanner;
public class monthlyPayment {
    private double monthlyInterestRate;
    private double monthlyPayment;
    private double totalPayment;

    double loanToPay(double loanAmount, double annualInterestRate, Byte years) {
        double monthlyInterestRate = (annualInterestRate / 1200);
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1 / (Math.pow((1 + monthlyInterestRate), (years * 12)))));
        double totalPayment = monthlyPayment * years * 12;
        double payable_per_month = (int) (monthlyPayment * 100) / 100.0;
        double total_payable = (int) (totalPayment * 100) / 100.0;
        return payable_per_month;
    }

    public void display() {
        System.out.print("Amount payable per month is:");
        System.out.print("Payable amount :");
    }


    public static void main(String[] args) {
        System.out.println("Enter loan amount:");
        Scanner input = new Scanner(System.in);
        double loanAmount = input.nextDouble();
        System.out.println("Number of Years:");
        Byte years = input.nextByte();
        double annualInterestRate = input.nextDouble();


        monthlyPayment obj = new monthlyPayment();
        obj.loanToPay(loanAmount, annualInterestRate, years);
        obj.display();

    }

}