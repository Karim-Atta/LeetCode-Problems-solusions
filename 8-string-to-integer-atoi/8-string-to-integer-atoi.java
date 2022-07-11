class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        int num = 0;
        boolean isThereASign = false;
        boolean isThereADigit = false;
       
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                isThereADigit = true;
                int digit = s.charAt(i) - '0';

               if ((num > Integer.MAX_VALUE / 10) || 
                (num == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) 
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;    
               num = num * 10 + digit;
            }else if(s.charAt(i) == ' '){
                if( isThereADigit || isThereASign){
                    break;
                }
                continue;
            }
        
            else if(s.charAt(i) == '-'){
                if(isThereASign || isThereADigit)
                    break;
                isThereASign = true;
                sign = -1;
            
            }else if(s.charAt(i) == '+'){
                 if(isThereASign || isThereADigit)
                    break;
                isThereASign = true;

                sign = 1;
            }else
                break;
        }
     
        return num * sign;
    }
}