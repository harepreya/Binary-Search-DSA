import java.util.*;
public class PeakIndex {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=inp.nextInt();
        }
        System.out.println(peakIndexInMountainArray(arr));
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
           // start == end pointing towards the largest number in the array
        return start; // return end as both are equal
    }
}
