public class hollowTri {
    public static void main(String[] args) {
        int row = 4;
        // int col = 7;
        int i, j, k;
        for (i = 0; i <row; i++) {
            for (k = 4 - i; k > 0; k--) {
                System.out.print(" ");
            }
            System.out.println("*");
            for (j = 0; j < 9; j++) {
                if (i == row-1 ) {
                    System.out.print("*");
                }
            }
        }
    }
}