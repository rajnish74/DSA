package Arrays;

public class MissingElement {

    public static int missingElement(int[] arr){
        int xorSum=0;
//        xor with all the arr ele
        for(int n:arr){
            xorSum=xorSum^n;
        }
//        xorr with all ele in the range
        for(int i=0;i<= arr.length;i++){
            xorSum=xorSum^i;
        }
        return xorSum;
    }

    public static void main(String[] args) {

        int[] arr={2,1,0,3,6,4};
        int ans=missingElement(arr);
        System.out.println(ans);

    }
}
