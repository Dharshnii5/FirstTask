public class Smallnumber {
    public static void main(String[]args){
        int a=5, b=20, c=30;
        if (a<b && a<c){
            System.out.println("a is the smallest number");
        }
        else if (b<a && b<c){
            System.out.println("b is the smallest number");
        }
        else if (c<a && c<b) {
            System.out.println("c is the smallest number ");
        }
       else{
           System.out.println("the number is not matched");

        }
    }
}
