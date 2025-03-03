package Arrays;

// Problem statement

// Given an array ‘a’ of size ‘n’-1 with elements of range 1 to ‘n’. 
// The array does not contain any duplicates. Your task is to find the missing number.

// For example:
// Input:
// 'a' = [1, 2, 4, 5], 'n' = 5

// Output :
// 3

// brute force approch - o(n^2)
//space = o(1)
public class MissingNumber {
    public static int missingNumber(int[] a, int N) {
        // Write your code here
        // Navive approch
        for (int i = 1; i <= N; i++) {
            int flag = 0;
            for (int j = 0; j < N - 1; j++) {
                if (a[j] == i) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                return i;
            }
        }

        return -1;
    }
}

// BETTER APPROCH
// O(2N) = N
// SPACE COMPLEXITY - O(N)
class Solution2 {
    public static int missingNumber(int[] a, int N) {
        // Write your code here.
        int hash[] = new int[N + 1];
        for (int i = 0; i < N - 1; i++) {
            hash[a[i]]++;
        }

        for (int i = 1; i <= N; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}

// optimal 1 - o(n) space = o(1)
class Solutionoptimal {
    public static int missingNumber(int[] a, int N) {
        // Write your code here.
        int sum = (N * (N + 1)) / 2;

        int s2 = 0;

        for (int i = 0; i < N - 1; i++) {
            s2 += a[i];
        }

        return sum - s2;

    }
}

// otimal 2
class Solutionoptimalsecond {
    public static int missingNumber(int[] a, int N) {
        // Write your code here.
        int XOr1 = 0, Xor2 = 0;
        for (int i = 0; i < N - 1; i++) {
            Xor2 = Xor2 ^ a[i];
            XOr1 = XOr1 ^ (i + 1);
        }
        XOr1 = XOr1 ^ N;
        return XOr1 ^ Xor2;

    }
}
