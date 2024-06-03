package PCQs_31_5_24;

//setting matrix zeroes
public class Ques6 {
    public void setZeroes(int[][]matrix){
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        //linear traversal 
        for(int i =0; i<rows; i++){
            if (matrix[i][0] == 0) col0 = 0;
            for (int j=1; j<cols; j++){
                if(matrix[i][j]==0)
                matrix [i][0]=matrix[0][j]=0;
            }
        }
        //linear backward traversal
        for (int i=rows-1; i>=0; i--){
            for (int j=cols-1; j>=1; j--){
                if(matrix[i][0]==0 || matrix[0][j]==0)
                matrix[i][j]=0;
                if(col0==0)matrix[i][0]=0;
            }
        }
    }

    //main method
    public static void main(String[] args) {
        Ques6 solution = new Ques6();
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        System.out.println("Original matrix:");
        printMatrix(matrix);

        solution.setZeroes(matrix);

        System.out.println("Modified matrix:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}

