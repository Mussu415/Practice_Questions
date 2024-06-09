package PCQs_06_6_24;

import java.util.List;
import java.util.ArrayList;

// spiral matrix
public class Ques7 {
    List<Integer> spiralOrder (int[][] matrix){
        List<Integer> res= new ArrayList<>();

        if(matrix.length==0) {
            return res;
        }

        int rowBegin=0;
        int rowEnd = matrix.length-1;
        int colBegin=0;
        int colEnd = matrix[0].length-1;

        while (rowBegin <= rowEnd && colBegin <= colEnd){

            //Traverse Right
            for(int j = colBegin; j <= colEnd; j++){
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            //Traverse Down
            for(int j = rowBegin; j <= rowEnd; j++){
                res.add(matrix[j][colEnd]);
            }
            colEnd--;

            if(rowBegin <= rowEnd){

                //Traverse Left
                for(int j = colEnd; j >= colBegin; j++){
                    res.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            if(colBegin <= colEnd){

                //Traverse Up 
                for(int j = rowEnd; j >= rowBegin; j--){
                    res.add(matrix[j][colBegin]);
                }
            }
            colBegin++;
        }
        return res;
    }
    public static void main(String[] args) {
        Ques7 q = new Ques7();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> result = q.spiralOrder(matrix);
        System.out.println(result);

        int[][] matrix2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        List<Integer> result2 = q.spiralOrder(matrix2);
        System.out.println(result2);
    }
}

