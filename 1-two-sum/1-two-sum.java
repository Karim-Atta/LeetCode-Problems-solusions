class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> toCompletSum = new HashMap();
        for(int i = 0; i < nums.length; i++){
            toCompletSum.put(nums[i], i);
        }
         for(int i = 0; i < nums.length; i++){
            if(toCompletSum.containsKey(target - nums[i]) && i != toCompletSum.get(target - nums[i])){
             result[0] = i;
             result[1] = toCompletSum.get(target - nums[i]);
                break;
            }
        }
        return result;
    }
}