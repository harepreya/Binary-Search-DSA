public class NthRootNum {
    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        System.out.println(NthRoot(n,m));
    }
    public static int NthRoot(int n, int m)
    {
        int s =0;
        int e = m;
        while(s<=e){
            int mid = s+(e-s)/2;
            int res = func(mid,n,m);
            if(res == 1)
                return mid;
            else if(res ==0)
                s = mid+1;
            else
                e = mid-1;

        }
        return -1;
    }
    public static int func(int mid, int n, int m){
        long ans =1;
        for(int i=1;i<=n;i++){
            ans *= mid;
            if(ans>m)
                return 2;
        }
        if(ans==m)
            return 1;
        else
            return 0;
    }
}
