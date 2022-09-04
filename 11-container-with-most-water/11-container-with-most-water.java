class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while(left < right){
            int min = Math.min(height[left], height[right]);
            res = Math.max(res, min * (right - left));
            if(height[left] < height[right]){
                left++;
            }
            else if(height[right] < height[left]){
                right--;
            }else{
                left++;
                right--;
            }
        }
        
        return res;
    }
}