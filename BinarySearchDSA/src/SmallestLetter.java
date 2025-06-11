import java.util.*;
public class SmallestLetter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char arr[] = {'a', 'b','d','h'};
        char target = 'c';
        System.out.println(nextGreatestLetter(arr, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (letters[end] <= target || target < letters[start]) {
            return letters[start];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }
        return letters[start];
    }
}
