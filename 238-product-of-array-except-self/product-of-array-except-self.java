class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length]; 

        int[] productofTheFollowingNum = new int[nums.length];
        int[] productOfThePreviousNum = new int[nums.length];

        int currentPrevious = 1;
        int currentFollowing = 1;

        productOfThePreviousNum[0] = 1;
        for (int i = 1; i < nums.length; i++){
            productOfThePreviousNum[i] = currentPrevious * nums[i - 1];
            currentPrevious = productOfThePreviousNum[i];
        }

        productofTheFollowingNum[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--){
            productofTheFollowingNum[i] = currentFollowing * nums[i + 1];
            currentFollowing = productofTheFollowingNum[i];
        }

        for(int i = 0; i < nums.length; i++){
            answer[i] = productofTheFollowingNum[i] * productOfThePreviousNum[i];
        }
        
        return answer;
    }
}