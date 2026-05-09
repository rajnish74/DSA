package Arrays;

import java.util.Arrays;

public class PairOfSum {
    public static void main(String[] args) {
        int arr[]={2,5,1,8,7,10,13,15,4};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int i=0;
        int j=arr.length-1;
        int sum=15;

        while (i<j){
            if (arr[i]+arr[j]>sum){
                j--;
            }
            else if (arr[i]+arr[j]==sum){
                System.out.println(arr[i] +" "+ arr[j]);
                i++;
                j--;
            }
            else {
                i++;
            }
        }
    }
}
