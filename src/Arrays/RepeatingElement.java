package Arrays;

import java.util.Arrays;

public class RepeatingElement {

    public static int[] serachAll(int arr[],int element){

        int n=arr.length;
        int output[]=new int[n+1];
        int j=0;   //output


        for(int i=0;i<n;i++){
            if(arr[i]==element){
                output[j]=i;
                j++;
            }
        }
        output[j]=-1;
        return output;
    }


    public static void main(String[] args) {
        int arr[]={2,3,6,7,4,7,8,7};
        System.out.println(Arrays.toString(arr));
        int output[]=serachAll(arr,7);

        for (int j=0;output[j]!=-1;j++){
            System.out.print(output[j] + ",");
        }

    }
}
