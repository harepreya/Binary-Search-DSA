public class OrderAgnosticArray {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int target = 5;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];    //arr[s] < arr[e] => True or False
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
