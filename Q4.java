package COS201;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter 10 numbers:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter a number for index " + i + ": \n");
            nums[i] = scanner.nextInt();
        }

        System.out.println("\nThese are the inputs you just entered:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
