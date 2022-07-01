class Solution {
    public String longestPalindrome(String s) {
        
        String palindrom = "";
        for(int i = 0; i < s.length();i++){
            int l = i;
            int r = i;
            while(r < s.length() && l >= 0 && s.charAt(r) == s.charAt(l)){
                if(r - l + 1 > palindrom.length()){
                    palindrom = s.substring(l, r + 1);
                }
                r++;
                l--;
            }
            
            l = i;
            r = i + 1;
            while(r < s.length() && l >= 0 && s.charAt(r) == s.charAt(l)){
                if(r - l + 1 > palindrom.length()){
                    palindrom = s.substring(l, r + 1);
                }
                r++;
                l--;
            }
            
        }
        return palindrom;
    }
    

    
}