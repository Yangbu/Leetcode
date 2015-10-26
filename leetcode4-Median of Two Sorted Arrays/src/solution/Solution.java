package solution;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(nums1.length == 0){
            return nums2.length%2==0? (double)(nums2[n/2-1] + nums2[n/2])/2 : (double)nums2[n/2];
        }
        if(nums2.length == 0){
            return nums1.length%2==0? (double)(nums1[m/2-1] + nums1[m/2])/2 : (double)nums1[m/2];
        }
        int i=0,j=0,k=0;
        int[] result = new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                result[k] = nums1[i];
                i++;
                k++;
            }else{
                result[k] = nums2[j];
                j++;
                k++;
            }
        }
        if(i==m){
            result = this.merge(Arrays.copyOfRange(result,0,k), Arrays.copyOfRange(nums2,j,n));
        }
        if(j==n){
            result = this.merge(Arrays.copyOfRange(result,0,k), Arrays.copyOfRange(nums1,i,m));
        }
        return (m+n)%2 ==0 ? (double)(result[(m+n)/2-1] + result[(m+n)/2])/2 : (double)result[(m+n)/2];
    }
    public int[] merge(int[] a, int[] b){
        int x = a.length;
        int y = b.length;
        int[] res = new int[x+y];
        for(int i=0; i<x; i++){
            res[i] = a[i];
        }
        for(int j=0,k=x; j<y && k<res.length; j++,k++){
            res[k] = b[j];
        }
        return res;
    }
}
