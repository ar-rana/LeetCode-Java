package medium;

//using for loop

class Solution {
    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        StringBuilder str = new StringBuilder();
        int n = ((numRows-1)*2);
        int step = n;
        for (int i=0;i<numRows;i++) {
            if (i>0)
                step = step - 2;
            for(int j=i;j<s.length();j+=n){
                str.append(s.charAt(j));
                if (i!=0 && i!=(numRows-1) && j+step<s.length()){
                    str.append(s.charAt(j+step));
                }
            }
        }
        return str.toString();
    }
}


// using while loop


class Solution2 {
    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        StringBuilder str = new StringBuilder();
        int n = ((numRows-1)*2);
        int step = n;
        for (int i=0;i<numRows;i++) {
            if (i>0)
                step = step - 2;
            int j = i;
            while(j<s.length()){
                str.append(s.charAt(j));
                if (i!=0 && i!=(numRows-1) && j+step<s.length()){
                    str.append(s.charAt(j+step));
                }
                j += n;
            }
        }
        return str.toString();
    }
}