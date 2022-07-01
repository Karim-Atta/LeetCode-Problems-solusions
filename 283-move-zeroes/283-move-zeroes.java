class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                swap(nums, i, k);
                k++;
            }
        }
    }
    
    public void swap(int[] nums, int firstIndex, int secondIndex){
        int firstNum = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = firstNum;
    }
}