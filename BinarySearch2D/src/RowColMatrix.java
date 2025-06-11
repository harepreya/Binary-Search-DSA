import java.util.Arrays;

public class RowColMatrix {
    public static void main(String args[]){
        int[][] arr ={
                {10,20,30,40},
            {15,25,35,45},
        {33,42,55,65},
                {49,51,72,89}
        };
        int target = 35;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    public static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;
//3 cases
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[]{r, c};
            }
            if (arr[r][c] < target) {
                   r++;
            } else {
                  c--;
            }
        }
        return new int[]{-1, -1};
    }
}
