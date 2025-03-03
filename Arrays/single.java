package Arrays;

import java.util.*;

/* 

Problem statement
You are given a sorted array 'arr' of positive integers of size 'n'.
It contains each number exactly twice except for one number, which occurs exactly once.
Find the number that occurs exactly once.

Example :
Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.
Output: 2
time complexity = o(n^2)
space complexity = o(1)

*/

class Solutionfirst {
    public static int getSingleElement(int[] arr) {
        // Write your code here.

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            int nums = arr[i];
            for (int j = 0; j < n; j++) {
                if (arr[j] == nums) {
                    cnt++;
                }
            }

            if (cnt == 1) {
                return nums;
            }
        }

        return -1;

    }
}

/*
 * better approch 1
 * Time Complexity: O(N) + O(N) + O(N) = O(N)
 * Not Efficient?
 * The approach is not efficient because it requires O(maxi)
 * extra space, which is impractical if maxi is very large, leading to an
 * OutOfMemoryError.
 */

public class single {

    public static int getSingleElement(int[] arr) {
        // Write your code here.

        int n = arr.length;
        int maxi = arr[0];

        // better approch
        for (int i = 0; i < n; i++) {
            maxi = Math.max(arr[i], maxi);
        }

        int hash[] = new int[maxi + 1];

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1) {
                return arr[i];
            }
        }

        return -1;

    }
}

/*
 * BETTER APPROCH 2
 * Time Complexity: O(N) (one pass to count frequencies + one pass to find the
 * unique element)
 * Space Complexity: O(N) (storing frequency of each element in HashMap)
 */

class Solution1 {
    public static int getSingleElement(int[] arr) {
        // Write your code here.

        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);

            mpp.put(arr[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        return -1;

    }
}

/*
 * optimal approch
 * space complexity: O(1)
 * time complexity: O(N)
 */

class Solution2 {
    public static int getSingleElement(int[] arr) {
        // Write your code here.

        int xorr = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }

        return xorr;

    }
}