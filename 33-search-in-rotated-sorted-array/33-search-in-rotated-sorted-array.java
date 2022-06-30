class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        int index = -1;
        while (start <= end){
            mid = ((end - start) / 2) + start;
            if(nums[mid] == target){
                index = mid; 
                return mid;
            }else if (nums[mid] > target){
                if(nums[start] > target &&  nums[start] <= nums[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(nums[end] < target &&  nums[start] >= nums[mid]){
                    end =end - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return index;
    }
}