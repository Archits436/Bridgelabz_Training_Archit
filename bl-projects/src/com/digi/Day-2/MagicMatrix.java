public class MagicMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{2,7,6}, {9,5,1}, {4,3,8}};
        int n = matrix.length;
        int sum = 0;
        for(int j = 0; j < n; j++) {
            sum += matrix[0][j];
        }
        if(checkDiagonalSum(n, matrix, sum) && checkRowSum(n, matrix, sum) && checkColumnSum(n, matrix, sum)) {
            System.out.println("Magic Matrix");
        } else {
            System.out.println("Not a magic matrix");
        }
    }
    public static boolean checkRowSum(int n, int[][] matrix, int sum) {
        int currSum = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                currSum += matrix[i][j];  //Rows sum
            }
            if (currSum != sum) {
                return false;
            }
            currSum = 0;
        }
        return true;
    }

    public static boolean checkColumnSum(int n, int[][] matrix, int sum) {
        int currSum = 0;
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < n; i++) {
                currSum += matrix[j][i];  //Columns sum
            }
            if (currSum != sum) {
                return false;
            }
            currSum = 0;
        }
        return true;
    }

    public static boolean checkDiagonalSum(int n, int[][] matrix, int sum) {
        int currSum = 0;
        for(int i = 0; i < n; i++) {
            currSum += matrix[i][i];  //Diagonals sum
        }
        if(currSum != sum) {
            return false;
        }
        currSum = 0;
        for(int i = n - 1; i >= 0; i--) {
            currSum += matrix[i][i];
        }
        if(currSum != sum) {
            return false;
        }
        return true;
    }
}
