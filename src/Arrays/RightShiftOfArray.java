package Arrays;

import java.util.Scanner;

public class RightShiftOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        store last element
        int temp = arr[n-1];

//        move all element by 1 move from right to left
        for(int i = n-1; i>=1;i--){
            arr[i] = arr[i-1];
        }

//        store last element to index 0
        arr[0] = temp;

//        print array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
