class Solution {
    public int search(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;
        while(right >= left && right >= 0){
            int half = (right - left) / 2 + left;
            if(target == nums[half])
                return half;
            
            if(nums[half] > target)
                right = half - 1;
            else
                left = half + 1;
            
        }
        return  -1;
    }   
}