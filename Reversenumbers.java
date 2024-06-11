public class Reversenumbers {
    public static void main(String[]args){
        int number= 876;
            int reversedNumber =678;
            System.out.println("Reversed number:"+ reversedNumber);

    }
    public static int reversedNumber(int number){
        int reversed=0;
        while(number!=0){
            int digit= number %10;
            reversed=reversed*10+digit;
            number/=10;

        }
        return reversed;

    }
}
