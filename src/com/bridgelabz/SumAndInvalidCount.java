import java.util.Scanner;
/*
	Step 1 : Start
	Step 2 : Declare variable sum and invalidCount
	Step 3 : Initialize variables
		 sum <--0
		 invalidCount <--0
	Step 4 : Read num from the command line arguments
	Step 5 : Repeat the steps until arg < arg.length
	     5.1: sum <--sum + num;
	     5.2: if exception occurs
			invalidCount++
	Step 6: Display Sum of valid integers.
			and count of invalid inputs.
	Step 7: Stop

*/
public class SumAndInvalidCount {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg);
                invalidCount++;
            }
        }

        System.out.println("Sum of valid integers: " + sum);
        System.out.println("Count of invalid inputs: " + invalidCount);
    }
}
