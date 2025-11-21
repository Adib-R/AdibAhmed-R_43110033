package nov21_25;
import java.util.Scanner;

public class Finaly {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        
        try {
            System.out.println(n);
        } 
        catch (Exception e) {
            System.out.println("Exception caught");
        }
        finally {
            System.out.println("This is the finally block");
        }
    }
}
