class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        int i= 0; // left pointer
        int j= n-1; // right pointer
        int[] ans= new int[2];
        while(i < n){
            int sum= numbers[i] + numbers[j]; // calculate sum
            if(sum == target){ // if got ans then return it:)
                ans[0]= i+1;
                ans[1]= j+1;
                return ans;
            }else if(sum < target){ // if sum is less than try to increase it by moving i+1
                i++;
            }else { // if sum is larger than try to decrease it by moving j-1
                j--;
            }
        }
        return ans;
    }
}