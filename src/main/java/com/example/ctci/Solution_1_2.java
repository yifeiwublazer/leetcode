package com.example.ctci;

import java.util.Arrays;

public class Solution_1_2 {
    //Solution1
    public String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public boolean isPermutation1(String s1, String s2) {
        return sort(s1).equals(sort(s2));
    }

    //Solution2
    public boolean isPermutation2(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int[] letters = new int[128]; //Assume ASCII chars
        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            letters[c]--;
            if(letters[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
