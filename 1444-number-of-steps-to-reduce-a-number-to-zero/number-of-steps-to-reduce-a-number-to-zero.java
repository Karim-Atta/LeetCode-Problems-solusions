class Solution {
    public int numberOfSteps(int num) {
        int numOfSteps = 0;
        while(num > 0){
            if((num & 1) == 0){
               num >>= 1;
            }else{
                num --;
            }
            numOfSteps ++;
        }
        return numOfSteps;
    }
}