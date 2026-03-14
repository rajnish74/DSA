package Maths;

import java.util.Scanner;

public class PrimeCheck {

    public static boolean isPrime(int n){
        for (int i=2;i*i<=n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int A,int B){
        for (int i=A;i<=B;i++){
            if (isPrime(i)){
                System.out.print(i + " ");

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int A=sc.nextInt();
        int B=sc.nextInt();

        printPrimes(A,B);

//
//        int n=sc.nextInt();
//        if (isPrime(n)){
//            System.out.println("This is prime no");
//        }
//        else {
//            System.out.println("Not prime");
//        }

    }
}
