
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.print((2 * i + 1));
            if (i < a - 1) {
            	System.out.print(", ");
            }
        }
    }
}
/*
input a = 1, then output : 1
input a = 2, then output : 1, 3
input a = 3, then output : 1, 3, 5
input a = 4, then output : 1, 3, 5, 7
. . . odd number series based on count of a 
*/