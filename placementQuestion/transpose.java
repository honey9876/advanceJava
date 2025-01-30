package placementQuestion;

public class transpose {
    public static void main(String[] args) {
        int [] [] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},

        };

        int row = matrix.length;
        int cols = matrix[0].length;
        int [][]  trans = new int[cols][row];

        for(int i= 0; i<row; i++){
            for(int j = 0; j< cols; j++){
                trans[j][i] = matrix[i][j];
            }

        }

        for(int i =0; i<cols; i++){
            for(int j =0; j<row; j++){
                System.out.print(trans[i][j] + " ");

            }
            System.out.println();
        }

    }
}
