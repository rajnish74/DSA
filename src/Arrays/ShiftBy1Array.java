package Arrays;

public class ShiftBy1Array {

    public static void shiftBy1(int arr[]){
        //step1: store last value
        int n=arr.length;
        int temp=arr[n-1];

//        shift all value of array
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
//        temp value to copy 0 index
        arr[0]=temp;
    }

    public static void main(String[] args) {

        int arr[]={10,20,30,40,50,60};
        shiftBy1(arr);
        for(int a:arr){
            System.out.println(a);
        }

    }
}
