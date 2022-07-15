class Solution {
    int length;
    int[] numbers;
    Long[][] dp;
    public long maxAlternatingSum(int[] nums) {
        dp = new Long[nums.length][2];
        length = nums.length;
        numbers = nums;
        return Math.max(nums[0] + dfs(1, -1), dfs(1, 1));
    }
    
    public long dfs(int index, int sign){
        if(index >= length){
            return 0;
        }
        if(dp[index][sign == 1? 0: 1]!= null){
            return dp[index][sign == 1? 0: 1];
        }
      
        
        return dp[index][sign == 1 ? 0 : 1] = Math.max(
            numbers[index] * sign + dfs(index + 1, sign * -1), 
            dfs(index + 1, sign)
        );
    }
}