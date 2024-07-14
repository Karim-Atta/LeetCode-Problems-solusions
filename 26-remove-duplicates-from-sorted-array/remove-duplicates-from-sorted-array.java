class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length;j++){
                if(nums[j] == nums[i]){
                    
                }else{
                    nums[k + 1] = nums[j];
                    k++;
                    i = j;
                }
            }
        }
        return k + 1;
    }
}