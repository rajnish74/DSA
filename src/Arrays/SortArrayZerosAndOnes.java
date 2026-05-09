package Arrays;

public class SortArrayZerosAndOnes {

    public static int[] sortArray(int[] nums){
        int n=nums.length;
        int i=0,j=n-1;

        while (i<j){
            if(nums[i]==1 && nums[j]==0){
                //            swap
                nums[i]=0;
                nums[j]=1;
            }
            if(nums[i]==0) i++;
            if(nums[j]==1) j--;


        }
        return nums;

    }


    public static void main(String[] args) {

        int[] arr={1,0,1,0,0,1,1,0,0};
        int[] ans=sortArray(arr);
        for(int n:ans){
            System.out.println(n);
        }


    }
}
