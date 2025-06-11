public class MinimumRotatedArray {
    public static void main(String args[]) {
        int nums[] = {10, 12, 1, 2, 3, 5, 6};
        System.out.println("Minimum number is:"+search(nums));
    }

    static int search(int[] nums) {
        int pivot = findPivot(nums);
        return nums[pivot+1];
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {

                start= mid + 1;
            }
        }
        return -1;
    }

}
