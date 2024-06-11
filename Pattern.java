import java.util.Scanner;

public class Pattern {
public static void main (String[]args){
    Scanner scanner = new Scanner(System.in) ;
    System.out.println("Enter the number of rows:");
    int rows =scanner.nextInt();

    for (int i = rows; i >= 1; i--){
        for (int j =rows; j >= 1; j--){
            if(j>i){
                System.out.print(j);
            }
            else{
                System.out.print(i);

            }
        }
        System.out.println();

    }

    scanner.close() ;
}

}
