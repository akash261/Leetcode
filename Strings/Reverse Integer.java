// Reverse Integer

//Given a 32-bit signed integer, reverse digits of an integer.

class Solution {
    public int reverse(int x) {
        int length ;
        int result=0,rem,i=0;
        int flag;
       
         
        if(x>0)
        flag=1;
        else 
        {
            flag=-1;
            x=x*(-1);
        }
        length = String.valueOf(x).length();
    
        while(x>0)
        {
            rem = x%10;
            result+=rem*Math.pow(10,length-1-i);
            x/=10;
            i++; 
        }
        
        if(result>=Integer.MAX_VALUE || result<=Integer.MIN_VALUE) return 0;
        return flag*result;
    }
}