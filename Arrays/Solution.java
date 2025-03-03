package Arrays;

/* Given an array arr, rotate the array by one position in clockwise direction. - gfg
 Examples:
 Input: arr[] = [1, 2, 3, 4, 5]
 Output: [5, 1, 2, 3, 4]
 Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.

 Time Complexity: O(n)
 Space Complexity: O(1) */

class Rotedarrayoneplace {
    public void rotate(int[] arr) {

        // code here
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}

/*
 * Problem statement -- coding ninja
 * Given an array 'arr' containing 'n' elements, rotate this array left once and
 * return it.
 * Rotating the array left by one means shifting all elements by one place to
 * the left and moving the first element to the last position in the array.
 * 
 * / Time Complexity: O(n)
 * // Space Complexity: O(1)
 * 
 * Example:
 * Input: 'a' = 5, 'arr' = [1, 2, 3, 4, 5]
 * 
 * Output: [2, 3, 4, 5, 1]
 */

 public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;

        return arr;

    }
}
