import java.util.*;
public class SearchInMountainArray {
    public static void main(String args[]){
        int arr[] = { 1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target){
       int peak = peakIndexInMountainArray(arr);
       int ascOrder = binarySearch(arr,target,0,peak);
       if(ascOrder!=-1)
           return ascOrder;
       return binarySearch(arr,target,peak+1,arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]) // descending order part, so go left side
                end = mid;
            else  //ascending order part so go right side
                start = mid+1;
        }
        return start;
    }
    static int binarySearch(int[] arr, int target,int start, int end){
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int m = start + (end - start)/2;
            if(target==arr[m])
                return m;
            if(isAsc){
                if(target<arr[m])
                    end = m-1;
                else
                    start = m+1;
            }
            else{
                if(target>arr[m])
                    end=m-1;
                else
                    start = m+1;
            }
        }
        return -1;
    }
}
