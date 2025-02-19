package Arrays;
// time compxity = o(n)

public class checkarraysortedornot {
    public static int isSorted(int n, int[] a) {
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                return 0; 
            }
        }
        return 1;
    }
}
