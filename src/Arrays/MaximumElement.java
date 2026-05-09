package Arrays;

public class MaximumElement {

    public static int maxElement(int arr[]){
        int max=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return  max;
    }

    public static void main(String[] args) {
        int arr[]= {2, 5, 9, 7, 6};
        System.out.println(maxElement(arr));

    }
}
