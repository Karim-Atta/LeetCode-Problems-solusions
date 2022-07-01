class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length+nums2.length];
        int i =0 ;
        int k =0;
        int j = 0;
        double result = 0.0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                merge[k++] = nums1[i++];
            }else{
                merge[k++] = nums2[j++];
            }
        }
        
        while(k < merge.length){
            if(i < nums1.length){
                merge[k++] = nums1[i++];
            }
            if(j < nums2.length){
                merge[k++] = nums2[j++];
            }
        }
        
        if(k % 2 == 0){
            result = (merge[k / 2] + merge[ k / 2 - 1]) / 2.0;
        }else{
            result = merge[k / 2];
        }
        return result;
    }
}