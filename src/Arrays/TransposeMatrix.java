package Arrays;

public class TransposeMatrix {

    public static int[][] transposeMatrix(int[][] matrix){
        int totalRow=matrix.length;
        int totalCol=matrix[0].length;

        int[][] ans=new int[totalCol][totalRow];

        for(int i=0;i<totalRow;i++){
            for (int j=0;j<totalCol;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] result = transposeMatrix(matrix);

        // print result
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
