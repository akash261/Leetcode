// Climbing Stairs

//You are climbing a stair case. It takes n steps to reach to the top.Each time you can either climb 1 or 2 steps. In how many distinct ways you climb to the top?

//Note: Given n will be a positive integer.

class Solution {
    public int climbStairs(int n) {
        
        int[] temp = new int[n+1];
        temp[0] = 1;
        temp[1] = 1;
         
        for(int i=2;i<=n;i++)
        {
            temp[i] = temp[i-1]+temp[i-2];
        }

        return temp[n];
        
    }
}