//LEETCODE-4

public class FindMedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        // Ensure nums1 is the smaller array
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int l = 0;
        int r = m;  // Allow i up to m
        int half = (m + n + 1) / 2;  // Correct partition size

        while (l <= r) {  // Changed from l < r to l <= r
            int i = l + (r - l) / 2;
            int j = half - i;

            // Boundaries for nums1
            int Aleft = (i > 0) ? nums1[i - 1] : Integer.MIN_VALUE;
            int Aright = (i < m) ? nums1[i] : Integer.MAX_VALUE;

            // Boundaries for nums2
            int Bleft = (j > 0) ? nums2[j - 1] : Integer.MIN_VALUE;
            int Bright = (j < n) ? nums2[j] : Integer.MAX_VALUE;

            if (Aleft <= Bright && Bleft <= Aright) {
                // Found correct partition
                if ((m + n) % 2 != 0) {
                    return Math.max(Aleft, Bleft);
                } else {
                    return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
                }
            } else if (Aleft > Bright) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }

        return -1;
    }
}

