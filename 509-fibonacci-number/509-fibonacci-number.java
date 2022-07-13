class Solution {
    int[] dp;
    public int fib(int n) {
        dp = new int[n + 1];
        return dpFib(n);
    }
    
    public int dpFib(int n){
        if(dp[n] != 0)
            return dp[n];
            
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
            
        dp[n] = dpFib(n - 1) + dpFib(n - 2);
        return dp[n];        
    
    }
}