class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();
        int m = nums1.length;
        int n = nums2.length;
        int x = 0, y = 0;
        while (x < m && y < n) {
            if (nums1[x] < nums2[y]) {
                a.add(nums1[x]);
                x++;
            } else {
                a.add(nums2[y]);
                y++;
            }
        }
        while (x < m) {
            a.add(nums1[x]);
            x++;
        }
        
        while (y < n) {
            a.add(nums2[y]);
            y++;
        }
        double ans;

        if ((m + n) % 2 == 0) {
            ans = (a.get((m + n) / 2) + a.get(((m + n) / 2) - 1)) / 2.0;
        } else {
            ans = a.get((m + n) / 2);
        }

        return ans;
    }
}