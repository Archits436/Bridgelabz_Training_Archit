public class MatrixAddition {
    public static void main(String[] args) {
        int[][] M1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] M2 = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        int[][] M3 = new int[M1.length][M1[0].length];

        for(int i = 0; i < M1.length; i++) {
            for(int j = 0; j < M1[0].length; j++) {
                M3[i][j] = M1[i][j] + M2[i][j];
            }
        }
        for(int i = 0; i < M1.length; i++) {
            for(int j = 0; j < M1[0].length; j++) {
                System.out.print(M3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
