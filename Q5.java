import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int[][] array = new int[11][11];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 100 numbers for a 10x10 array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter a number for row " + i + ", and column " + j + ": ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nYou entered the following numbers:");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
