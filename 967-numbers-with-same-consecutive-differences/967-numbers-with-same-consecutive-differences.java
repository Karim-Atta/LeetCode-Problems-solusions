class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> numWithTheSameConsecutiveDiff = new ArrayList();
        
        for(int i = 1; i < 10; i++){
            dfs(i, numWithTheSameConsecutiveDiff, i, n - 1, k);
        }       
        int[] res = new int[numWithTheSameConsecutiveDiff.size()];
        
        for(int i = 0; i < numWithTheSameConsecutiveDiff.size(); i++){
            res[i] = numWithTheSameConsecutiveDiff.get(i);
        }
        return res;
    }
        
    public void dfs(int num,List<Integer> res, int digit, int n, int k){
        if(n == 0){
            res.add(num);
            return;
        }
    
        
        if(digit + k < 10){
            dfs(num * 10 +  digit + k, res, digit + k, n - 1, k);
        }
        
        if(k != 0 &&digit - k >= 0){
            dfs(num * 10 + digit - k, res, digit - k, n - 1, k);
        }
    }
}