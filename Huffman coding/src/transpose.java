import java.util.Arrays;

public class transpose {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] mat1 = new int[3][3];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                mat1[j][i] = matrix[i][j];
            }
        }

        for(int i = 0; i < mat1.length; i++){
            System.out.print("[ ");
            for(int j = 0; j < mat1[0].length; j++){
                System.out.print(mat1[i][j] + ", ");
            }
            System.out.println(" ]");
        }

    }
}
