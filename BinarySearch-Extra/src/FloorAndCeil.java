import java.util.*;

public class FloorAndCeil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = 6;
        int target = 8;
        int arr[] = {2,3,4,5,7,8};
        int res[] = func(arr,target,n);
        System.out.println(Arrays.toString(res));
    }
    public static int[] func(int arr[], int t, int n ){
        int s =0;
        int e = n;
        int floor = -1;
        int ceil = -1;
        while(s<=e) {
            int m = s + (e - s) / 2;
            if (arr[m] == t) {
                floor = ceil = arr[m];
                break;
            }
            else if (arr[m] < t) {
                floor = arr[m];
                s = m + 1;
            }
            else{
                ceil = arr[m];
                e = m-1;
            }
        }
        return new int[]{floor,ceil};


    }
}
