package Arrays;

public class SortedArray {

    public static int sort(int[] arr){
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[i+1]){
                return 0;
            }
        }
        return 1;
    }
}
