import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Hashtable<Character, Integer> ht = new Hashtable<>();
        int tempStart = 0, i = 0;
        int max = 0;

        while (i < s.length())
        {
            if (ht.containsKey(s.charAt(i)))
                tempStart = (ht.get(s.charAt(i)) + 1 > tempStart)? ht.get(s.charAt(i)) + 1: tempStart;
        
            ht.put(s.charAt(i), i);
            max = (i - tempStart + 1 > max)? i - tempStart + 1: max;
            i++;
        }
        return max;
    }
}