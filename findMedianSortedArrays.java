class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        int i = 0;
        int j = 0;
        int t = 0;
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                arr[t] = nums1[i];
                t++;
                i++;
            }
            else{
                arr[t] = nums2[j];
                t++;
                j++;
            }
        }
        while(i<m){
            arr[t] = nums1[i];
            t++;
            i++;
        }
        while(j<n){
            arr[t] = nums2[j];
            t++;
            j++;
        }
        if((m+n)%2 == 0){
            int p = ((m+n)/2)-1;
            int q = (m+n)/2;
            double ans = (arr[p]+arr[q])/2.0;
            return ans;
        }
        else{
            int p = (m+n)/2;
            double ans = arr[p];
            return ans;
        }
    }
}
