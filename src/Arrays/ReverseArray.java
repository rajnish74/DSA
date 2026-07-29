package Arrays;

public class ReverseArray {

    public void reverse(int[] arr) {
        int n = arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
}
