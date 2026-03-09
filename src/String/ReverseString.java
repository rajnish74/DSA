package String;

import java.util.Scanner;

public class ReverseString {

    public static void reverse(char[] s){
        int start=0;
        int end=s.length-1;

        while (start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] s=str.toCharArray();
        reverse(s);
        System.out.println(s);


    }
}
