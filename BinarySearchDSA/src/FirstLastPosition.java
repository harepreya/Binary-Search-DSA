import java.util.*;
public class FirstLastPosition {
    public static void main(String[] args) {
        int ans[] = {-1, -1};
        int arr[] = {1, 3, 5, 6, 7, 9, 10, 13, 13, 13, 13, 13, 19, 29, 38, 40};
        int target = 13;
        int start = find(arr, target, true);
        int end = find(arr, target, false);

        ans[0]=end;
        ans[1]=start;
        System.out.println(Arrays.toString(ans));
        // count
        System.out.println(ans[1] - ans[0] + 1);
    }
    public static int find(int arr[], int target, boolean val){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int m = start + (end - start)/2;
            if(target>arr[m]){
                start = m+1;
            }
            else if(target<arr[m]){
                end = m-1;
            }
            else {
                ans = m;
                if (val) {
                    start = m + 1;
                } else
                    end = m - 1;
            }
        }
        return ans;
    }


}
