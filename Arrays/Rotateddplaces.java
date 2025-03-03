package Arrays;

import java.util.ArrayList;
import java.util.Collections;

/*coding ninja
Problem statement
Given an array 'arr' with 'n' elements, the task is to rotate the array to the left by 'k' steps, where 'k' is non-negative.
Example:
'arr '= [1,2,3,4,5]
'k' = 1  rotated array = [2,3,4,5,1]
'k' = 2  rotated array = [3,4,5,1,2]
'k' = 3  rotated array = [4,5,1,2,3] and so on.
*/

// TC = O(d) + O(n - d) + O(d) = O(n)
// SC = O(d)

public class Rotateddplaces {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        if (n == 0) return arr;


        int d = k % n; // Handle cases where d > n
        if (d == 0) return arr;

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < d; i++) {
            temp.add(arr.get(i)); // Store first d elements
        }

        for (int i = 0; i < n - d; i++) {
            arr.set(i, arr.get(i + d)); // Shift remaining elements left
        }

        for (int i = 0; i < d; i++) {
            arr.set(n - d + i, temp.get(i)); // Place temp elements at end
        }

        return arr;
    }
}


/* ====================optimal Approch============================

Total time complexity:
O(k)+O(n−k)+O(n)=O(n)

SC-O(1) (constant space).
*/

class Solution {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        if (n == 0) return arr;

        k = k % n; // Handle cases where k > n
        if (k == 0) return arr; // No need to rotate if k is 0

        // Step 1: Reverse first k elements
        Collections.reverse(arr.subList(0, k));

        // Step 2: Reverse the remaining n-k elements
        Collections.reverse(arr.subList(k, n));

        // Step 3: Reverse the entire array
        Collections.reverse(arr);

        return arr;
    }
}

