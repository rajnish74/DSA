package Arrays;

public class TwoSum {

    public static int[] twoSum(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    int ans[]={i,j};
                    return ans;
                }
            }
        }
        int[] ans={};
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,1,8,7,4};
        int target = 10;

        int[] res = twoSum(arr, target);

        if(res.length == 0){
            System.out.println("No pair found");
        } else {
            System.out.println("Index: " + res[0] + ", " + res[1]);
        }
    }
}
