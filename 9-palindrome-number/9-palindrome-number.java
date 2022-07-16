class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int reversedX = 0;
        while(num > 0){
            int carry = num % 10;
            reversedX = reversedX * 10 + carry;
            num /= 10;
        }
        
        return x == reversedX;
        
    }
}