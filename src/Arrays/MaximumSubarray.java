package Arrays;

public class MaximumSubarray {

    public static int maxSum(int nums[]){
        int sum=0;
        int maxSUm=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
//            step1: check sum
            sum=sum+nums[i];
//            step2: max sum
            maxSUm=Math.max(maxSUm,sum);
//            step3:check negative
            if(sum<0){
                sum=0;
            }
        }
        return maxSUm;
    }


    public static void main(String[] args) {

        int[] arr={5,4,-1,7,8};
        int ans=maxSum(arr);
        System.out.println(ans);
    }
}
