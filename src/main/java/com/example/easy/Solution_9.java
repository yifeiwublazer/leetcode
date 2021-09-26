package com.example.easy;

public class Solution_9 {
    public boolean isPalindrome1(int x) {
        if( x < 0 || (x % 10 == 0 && x != 0) ) return false;
        int revertedNumber = 0;
        while( x > revertedNumber ){
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }

    public boolean isPalindrome2(int x) {
        String xToString = Integer.toString(x);
        String rev = new StringBuilder(xToString).reverse().toString();
        if(xToString.equals(rev))
            return true;
        else
            return false;
    }
}
