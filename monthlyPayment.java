import java.util.Scanner;
public class monthlyPayment{
    public static void main (String[] args) {
        //enter loan amount 
        System.out.println("Enter loan amount:");
        Scanner input =new Scanner(System.in);
        double loanAmount= input.nextDouble();
        System.out.println("Number of Years:");
        Byte years = input.nextByte();
        final double annualInterestRate=5.75;
        double monthlyInterestRate =(annualInterestRate/1200);
        double monthlyPayment =(loanAmount*monthlyInterestRate)/(1-(1/(Math.pow((1+monthlyInterestRate),(years*12)))));
        double totalPayment=monthlyPayment*years*12;
        System.out.println("Amount payable per month is:"+(int)(monthlyPayment*100)/100.0);
        System.out.println("Payable amount "+(int)(totalPayment*100)/100.0);


        
    }


    
}