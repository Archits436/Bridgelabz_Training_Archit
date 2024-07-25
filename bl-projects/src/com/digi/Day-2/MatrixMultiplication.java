public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] M1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] M2 = {{7, 8, 9}, {4, 5, 6}, {1, 2, 3}};
        int[][] M3 = new int[M1.length][M1[0].length];
        int m = M1.length;
        int n = M1[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                M3[i][j] = 0;
                for(int k = 0; k < n; k++) {
                    M3[i][j] = M1[i][k] * M2[k][j];
                }
                System.out.print(M3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
