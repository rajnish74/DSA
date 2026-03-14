package Maths;

import java.util.Scanner;

public class SumOfDivisors {

    public static int sumDivisors(int n){
        int sum=0;

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if (i*i==n){
                    sum=sum+i;
                }
                else {
                    sum=sum+i+n/i;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumDivisors(n));
    }
}
