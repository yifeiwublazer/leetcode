package com.example.easy;

public class Solution_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return longestCommonPrefix(strs, 0 , strs.length - 1);
    }

    public String longestCommonPrefix(String[] strs, int l, int r) {
        if(l == r) return strs[l];
        int mid = (l + r) / 2;
        String leftLcp = longestCommonPrefix(strs, l, mid);
        String rightLcp = longestCommonPrefix(strs,mid + 1, r);
        return commonPrefix(leftLcp, rightLcp);
    }

    public String commonPrefix(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if(s1.charAt(i) == s2.charAt(i)) {
                result.append(s1.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }
}
