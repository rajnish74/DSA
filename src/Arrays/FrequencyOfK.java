package Arrays;

public class FrequencyOfK {

    public static int solve(int[] arr, int k) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                count++;
            }
        }
        return count;
    }
}
