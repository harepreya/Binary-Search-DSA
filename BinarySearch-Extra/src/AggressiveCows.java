import java.util.*;

public class AggressiveCows {
    public static void main(String[] args) {
       int position[] = {0,3,4,7,9,10};
       int m = 4;
        System.out.println(maxDistance(position,m));
    }
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int low = 1;
        int high = position[n-1] - position[0];
        while(low<=high){
            int mid = low + (high-low)/2;
            if(place(position,mid,m)==true){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return high;
    }

    public static boolean place(int[] position, int dis, int c){
        int n = position.length;
        int cnt = 1;
        int last = position[0];
        for(int i = 1;i<n;i++){
            if(position[i] - last >= dis){
                cnt++;
                last = position[i];
            }
            if (cnt >= c) return true;
        }
        return false;
    }
}
