package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

//        Insertion later
        int arr[]=new int[n+1];

//        Read the array of n elements
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//        print
        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<=n-1;i++){
//            System.out.print(arr[i] +" ");
//        }

        int pos=sc.nextInt();
        int y=sc.nextInt();

//        shifting
        for(int i=n-1; i>=pos-1; i--){
            arr[i+1]=arr[i];
        }
        arr[pos-1]=y;

        System.out.println(Arrays.toString(arr));

    }
}
