class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] stairCost = new int[cost.length];
        stairCost[0] = cost[0];
        stairCost[1] = cost[1];
        
        for(int i = 2; i < cost.length; i++){
            stairCost[i] = stairCost[i - 1] + cost[i];
            if(stairCost[i - 2] + cost[i] < stairCost[i]){
                stairCost[i] = stairCost[i - 2] + cost[i];
            }
        }
        if(stairCost[cost.length -1] < stairCost[cost.length -2]){
            return stairCost[cost.length - 1];
        }
        return stairCost[cost.length -2];
    }
}