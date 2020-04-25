// First Unique Character in a String

//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.


class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray(); 
        LinkedHashMap<Character,Integer> dict = new LinkedHashMap<Character,Integer>();
        for(char c: arr)
        {
            if(dict.containsKey(c))
            {
                dict.put(c,dict.get(c)+1);
            }
            else
                dict.put(c,1);
        }
        
         
        // for(Map.Entry entry:dict.entrySet())
        // {}
        
        for(char c:dict.keySet())
        {
            if(dict.get(c)==1)
                return s.indexOf(c);
        
            
        }
        
       return -1;
    }
}