//Reverse String
//Write a function that reverses a string. The input string is given as an array of characters char[].

//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

class Solution {
    public void reverseString(char[] s) {
        char temp;
        for(int i=0;i<s.length/2;i++)
        {
            temp=s[i];
             s[i]=s[s.length-1-i] ;
            s[s.length-1-i]=temp;
        }
         System.out.println(s);
    }
}