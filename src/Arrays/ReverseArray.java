package Arrays;

public class ReverseArray {

    public static void reverseArray(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;

        while (i<=j){
//            swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

//            i increase
            i++;
//          j decrease
            j--;
        }
        for(int k:arr){
            System.out.println(k);
        }
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        reverseArray(arr);

    }
}
