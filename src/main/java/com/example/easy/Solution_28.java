package com.example.easy;

public class Solution_28 {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;
        int start = 0;
        int end = needle.length();
        while(end <= haystack.length()){
            if(haystack.substring(start, end).equals(needle)){
                return start;
            }
            else {
                start++;
                end++;
            }
        }
        return -1;
    }
}
