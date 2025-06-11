public class MiniDaysToMakeBouquets {
    public static void main(String[] args) {
        int arr[]={7,7,7,7,13,11,12,7};
        int m=2;
        int k =3;
        System.out.println(minDays(arr,m,k));
    }

    public static int minDays(int[] arr, int m, int k) {
        long val = (long)m*k;
        int n = arr.length;
        if(val > n)
            return -1;
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            mini = Math.min(mini,arr[i]);
            maxi = Math.max(maxi,arr[i]);
        }
        int low = mini, high = maxi;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(possible(arr,mid,m,k))
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
    public static boolean possible(int[] arr, int day, int m, int k){
        int n = arr.length;
        int cnt =0;
        int numB =0;
        for(int i =0;i<n;i++){
            if(arr[i] <= day)
                cnt++;
            else{
                numB += (cnt)/k;
                cnt=0;
            }
        }
        numB +=(cnt)/k;
        return numB >= m;
    }
}
