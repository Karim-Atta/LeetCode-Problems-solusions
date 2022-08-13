class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
       int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        
        for(int i = 1; i < text1.length() + 1; i++){
            for(int j = 1; j < text2.length() + 1; j++){
                if(text1.charAt(i - 1) == text2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else{
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
    
    public int lcs(String text1, String text2, int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }
        
        if(text1.charAt(n - 1) == text2.charAt(m - 1)){
            return 1 + lcs(text1, text2, n - 1, m - 1);
        }else{
            return Math.max(lcs(text1, text2, n - 1, m), lcs(text1, text2, n, m - 1));
        }
    }
}