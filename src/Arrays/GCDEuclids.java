package Arrays;

import java.util.Scanner;

public class GCDEuclids {

    public static int gcd(int a, int b){
        while(a!=0){
            int a_=b%a;
            int b_=a;
            a=a_;
            b=b_;
        }
        return b;
    }

    public static void gcdOfN(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=sc.nextInt();

        for(int i=1;i<n-1;i++){
            int no=sc.nextInt();
            ans=gcd(ans,no);
        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        gcdOfN();
//        Scanner input = new Scanner(System.in);
//        int t = input.nextInt();
//        for(int i=0;i<t;i++){
//            int a = input.nextInt();
//            int b = input.nextInt();
//            System.out.println(gcd(a,b));
//        }

    }
}
