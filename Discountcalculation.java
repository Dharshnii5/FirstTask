import java.util.Scanner;

public class Discountcalculation {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the purchase amount");
        double amount = scanner.nextDouble();

        double discount=0.0;
        if (amount < 500){
            discount=0;

        }
         else if (amount >=500 && amount<=1000)   {
             discount=0.1;

        }
         else{
             discount=0.2;

        }
         double finalAmount= amount-(amount * discount);
         System.out.println("The final payable amount is:"+ finalAmount);

    }
}
