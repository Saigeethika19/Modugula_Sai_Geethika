
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        int count = a % 2 == 0 ? a - 1 : a; // if a is even consider the predecessor odd number

        for (int i = 0; i < count; i++) {
            int val = 2 * i + 1;
            if (val > a * 2) break;
            System.out.print(val);
            if (i < count-1) { 
            	System.out.print(", ");
            }
        }
    }
}
/*
input a = 1, then output : 1
input a = 2, then output : 1
input a = 3, then output : 1, 3, 5
input a = 4, then output : 1, 3, 5
input a = 5, then output : 1, 3, 5, 7, 9
input a = 6, then output : 1, 3, 5, 7, 9
*/