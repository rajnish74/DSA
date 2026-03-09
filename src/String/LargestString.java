package String;

import java.util.Scanner;

public class LargestString {


    public static String findLargestString(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        sc.nextLine();

        int largestLength=0;
        String largestString="";

        for(int i=1;i<=n;i++){
            String line=sc.nextLine();
            if (line.length()>largestLength){
                largestString=line;
                largestLength=line.length();
            }
        }
       return largestString;
    }

    public static void main(String[] args) {
        System.out.println("largest string is : "+findLargestString());
    }
}
