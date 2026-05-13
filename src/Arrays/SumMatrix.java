package Arrays;

import java.util.Arrays;

public class SumMatrix {

    public static int matrixSum(int[][] nums){
        int n=nums.length;
        int m=nums[0].length;

//        sort row
        for(int i=0;i<n;i++){
            Arrays.sort(nums[i]);
        }
        int sum=0;
        for(int j=0;j<m;j++){
            int max=0;
            for(int i=0;i<n;i++){
                max=Math.max(max,nums[i][j]);

            }
            sum +=max;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] nums = {
                {7,2,1},
                {6,4,2},
                {6,5,3},
                {3,2,1}
        };

        int result = matrixSum(nums);

        System.out.println("Matrix Sum: " + result);
    }
}
