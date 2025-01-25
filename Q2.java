public class Q2 {
    public static void main(String[] args) {
        System.out.println("USA's Flag (Single Loop):");
        for (int i = 1; i <= 6; i++){
            if (i <=3 ){
                System.out.println("* * * * = = = = = = =");
            } else {
                System.out.println("= = = = = = = = = = =");
            }
        }
        System.out.println();

        System.out.println("USA Flag (Nested Loop):");
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 12; col++) {
                if (row < 3 && col < 4) {
                    System.out.print("* ");
                } else {
                    System.out.print("= ");
                }
            }
            System.out.println();
        }
    }
}
