import java.util.*;
public class CeilingNumber {
    // smallest number that is greater than or equal to target
    public static void main(String[] args) {

        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, target = 9;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int m = start + (end - start)/2;
            if(target>arr[m])
                start = m+1;
            else if(target<arr[m])
                end = m-1;
            else
                return arr[m];
        }
        return arr[start];
    }
}
