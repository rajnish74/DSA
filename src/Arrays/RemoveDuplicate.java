package Arrays;

public class RemoveDuplicate {

    public static int removeDuplicate(int nums[]){
        if(nums.length==0) return 0;

        int i=0;
        int j=1;
        for(j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[]={0,0,1,1,3,3,5,6,6};
        System.out.println(removeDuplicate(arr));
    }
}
