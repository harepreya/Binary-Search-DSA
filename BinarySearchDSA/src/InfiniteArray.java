import java.util.*;
public class InfiniteArray {
    public static void main(String[] args) {
        //when we dont know the length of the array
        int arr[] = {2,3,7,8,9,13,19,24,39,40,56,68,79};
        int target = 24;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr ,int target){
        int start =0;
        int end = 1;

        while(end < arr.length && target > arr[end]){
            int newstart = end +1;
            end = end + (end - start +1) * 2;
            start = newstart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int m = start + (end - start)/2;
            if(target>arr[m])
                start = m+1;
            else if(target<arr[m])
                end = m-1;
            else
                return m;
        }
        return -1;
    }
}
