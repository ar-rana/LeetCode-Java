package medium;

import java.util.HashSet;
import java.util.Set;

class longestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> a = new HashSet<>();
        int max = 0;
        int left = 0;
        for (int r=0; r<s.length(); r++){
            if(!a.contains(s.charAt(r))) {
                a.add(s.charAt(r));
                max = Math.max(max, r - left + 1);
            }
            else {
                while(a.contains(s.charAt(r))){
                    a.remove(s.charAt(left));
                    left++;
                }
                a.add(s.charAt(r));
            }
            
        }
        return max;
    }
}