class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sortedNotSignedNums = new int[nums.length];
        int s = 0;
        int e = nums.length - 1;
        int sSquar = 0;
        int eSquar = 0;
        int currentIndex = nums.length - 1;
        while(e >= s){
            sSquar = (int) Math.pow(Double.valueOf(nums[s]), 2.0);
            eSquar = (int) Math.pow(Double.valueOf(nums[e]), 2.0);
            if(eSquar > sSquar){
                sortedNotSignedNums[currentIndex] = eSquar;
                e--;
            }else{
                sortedNotSignedNums[currentIndex] = sSquar;
                s++;
            }
            currentIndex--;
        }
        return sortedNotSignedNums;
    }
}