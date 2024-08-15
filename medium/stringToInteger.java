package medium;

// much faster solution 
class Solution {
    public int myAtoi(String s) {
        if ( s == null)
            return 0;
        s = s.trim();
        if (s.length() == 0)
            return 0;
        int y = 0;
        int nve = 1;
        if (s.charAt(0) == '-'){
            nve = -1;
        }
        int i = s.charAt(0) == '-' || s.charAt(0) == '+'?1:0;
        while(i<s.length()) {
            if (!Character.isDigit(s.charAt(i))) 
                break;
            if (y > Integer.MAX_VALUE/10 || (y == Integer.MAX_VALUE/10 && (s.charAt(i) - '0') > 7 ))
                return nve>0?Integer.MAX_VALUE: Integer.MIN_VALUE;
            y = y*10 + (s.charAt(i) - '0');
            i++;
        }
        return y*nve;
    }
}

// way slower
class Solution2 {
    public int myAtoi(String s) {
        if ( s == null)
            return 0;
        s = s.trim();
        if (s.length() == 0)
            return 0;
        int y = 0;
        int nve = 1;
        if (s.charAt(0) == '-'){
            nve = -1;
        }
        int i = s.charAt(0) == '-' || s.charAt(0) == '+'?1:0;
        while(i<s.length()) {
            if (!Character.isDigit(s.charAt(i))) 
                break;
            if (y > Integer.MAX_VALUE/10 || (y == Integer.MAX_VALUE/10 && Character.getNumericValue(s.charAt(i)) > 7 ))
                return nve>0?Integer.MAX_VALUE: Integer.MIN_VALUE;
            y = y*10 + Character.getNumericValue(s.charAt(i));
            i++;
        }
        System.out.println(y*nve);
        return y*nve;
    }
}
