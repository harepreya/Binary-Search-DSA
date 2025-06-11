public class KthMissingNumber {
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,9};
        int k = 3;
        System.out.println(findKthPositive(arr,k));
    }
    public static int findKthPositive(int[] vec, int k) {
    int low = 0, high = vec.length - 1;
        while (low <= high) {
        int mid = (low + high) / 2;
        int missing = vec[mid] - (mid + 1);
        if (missing < k) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
        return k + low;
}
}
