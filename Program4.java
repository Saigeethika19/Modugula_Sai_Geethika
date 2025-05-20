public class Program4 {
    public static void main(String[] args) {
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] countarr = new int[10]; // to store index from 1 to 9

        for (int digit = 1; digit <= 9; digit++) {
            for (int num : input) {
                if (num % digit == 0) {
                    countarr[digit]++; //update countarr when num is divisible by digit 
                }
            }
        }

        // for output to be in {1: 11, 2: 8, ...} format
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + countarr[i]);
            if (i != 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
/*
input: [1,2,8,9,12,46,76,82,15,20,30]
Output: 
  {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
*/