package Arrays;

public class UniqueElement {

    public static int findUniqueElement(int[] arr){
        int xorSum=0;

        for(int n:arr){
            xorSum=xorSum^n;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,3,5,3,6,1};
        int ans=findUniqueElement(arr);
            System.out.println(ans);


    }
}
