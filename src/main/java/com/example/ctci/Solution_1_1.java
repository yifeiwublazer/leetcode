package com.example.ctci;

public class Solution_1_1 {

    //Assume all ASCII chars
    public boolean isUniqueChars(String str) {
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

}
