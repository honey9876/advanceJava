package placementQuestion;

public class Rotate {
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = temp;
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j =0; j < n / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;

            }
        }
    }

    public static void main(String[] args) {
        int [][] matrix ={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        
        rotateMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
