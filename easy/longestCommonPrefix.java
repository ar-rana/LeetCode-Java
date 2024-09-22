import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s = strs[0];
        String l = strs[strs.length - 1];
        int j = 0;
        while(j<s.length() && j<l.length()) {
            if (s.charAt(j) == l.charAt(j)){
                j++;
            } else {
                break;
            }
        }
        return s.substring(0,j);
    }
}
