import java.util.*;
public class Search {
    // binary search
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=inp.nextInt();
        }
        int target = inp.nextInt();
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
                return m;
        }
        return -1;
    }
}
