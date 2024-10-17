class palindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int y = 0;
        int z = x;
        while(z!=0) {
            int digit = z%10;
            z /= 10;
            if (y>Integer.MAX_VALUE/10 || (y == Integer.MAX_VALUE/10 && digit > 7))
                return false;
            y = y*10 + digit;
        }
        return x == y? true: false;
    }
}