import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        //var declaration
        double amount;
        double principal;
        double rateOfInterest;
        double timesCompound;
        double years;

        Scanner input = new Scanner(System.in);

        //request input value
        System.out.print("Enter principal amount : ");
        principal = input.nextDouble();

        System.out.print("Enter interest rate (in %) : ");
        rateOfInterest = input.nextDouble() / 100 ;

        System.out.print("Enter # of times compounded per year : ");
        timesCompound = input.nextDouble();

        System.out.print("Enter the # of years : ");
        years = input.nextDouble();

        //compound interest calculation
        amount = principal * Math.pow( 1 + ( (double) rateOfInterest/timesCompound ),(timesCompound * years));

        //showing answer of compound interest
        System.out.printf("The amount after %.1f year(s) is %,1.2f\n",years,amount);

        //input close
        input.close();
    }
}
