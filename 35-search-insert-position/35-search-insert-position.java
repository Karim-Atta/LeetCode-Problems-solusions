class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int h = 0;
        while(e >= s){
            h = (e - s) / 2 + s;
            if(nums[h] == target)
                return h;
            else if(nums[h] < target)
                s = h + 1;
            else
                e = h - 1;
        }
        return s;
    }
}