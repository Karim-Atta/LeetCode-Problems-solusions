class Solution {
    int[] numbers;
    public int findTargetSumWays(int[] nums, int target) {
        numbers = nums;
        return dfs(0, target, 0);
    }
    
    public int dfs(int index, int target, int result){
        if(index == numbers.length){
            if(result == target)
                return 1;
            return 0;
        }
        
        int negative = dfs(index + 1, target,  result + numbers[index] * -1);
        int positive = dfs(index + 1, target, result + numbers[index]);
        return negative + positive;
    }
}