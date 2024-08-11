package medium;

// we remove the check for edge case to make the programe mor erobust 
// time complexity remains same at : O(n^2)
class Solution {
    public static String longestPalindrome(String s) {
        int max = 0;
        int l = 0;
        int r = 0;
        String str = "";
        // if (s.length() == 1){
        //     System.out.println(s);
        //     return s;
        // }
        // if (s.length() == 2){
        //     System.out.println(s.substring(l,r+1));
        //     return s.substring(l,r+1);
        // }
        for (int i=0; i<s.length(); i++) {      
        // if (s.length() % 2 == 0){
            l = i;
            r = i+1; 
            while( l>= 0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                if (max < (r-l+1)){
                    max = r-l+1;
                    str = s.substring(l,r+1);
                }
                l--;
                r++;
            }
        // }
        // else if (s.length() % 2 != 0){
            l = i;
            r = i; 
            while (l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                if(max < (r-l+1)){
                    max = r-l+1;
                    str = s.substring(l,r+1);
                }
                l--;
                r++;
            }
        // }
        }
        System.out.println(str);
        return str;
    }
}