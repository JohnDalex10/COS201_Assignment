package COS201;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Nigeria's Flag (Single Loop):");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 12; j++) {
                if (j <= 4 || j > 8) {
                    System.out.print("* ");
                } else {
                    System.out.print("= ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Nigeria's Flag (Nested Loop):");
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 12; col++) {
                if (col < 4 || col >= 8) {
                    System.out.print("* ");
                } else {
                    System.out.print("= ");
                }
            }
            System.out.println();
        }
    }
}