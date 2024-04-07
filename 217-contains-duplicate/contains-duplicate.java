class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numToOccurance = new HashSet();

        for (int i = 0; i < nums.length; i++){
            if(numToOccurance.contains(nums[i])){
                return true;
            }
            numToOccurance.add(nums[i]);
        }
        return false;
    }
}