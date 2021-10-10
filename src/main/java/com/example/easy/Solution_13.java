package com.example.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution_13 {
    public int romanToInt(String s) {
        Map<Character, Integer> mapping = new HashMap<>();
        mapping.put('M', 1000);
        mapping.put('D', 500);
        mapping.put('C', 100);
        mapping.put('L', 50);
        mapping.put('X', 10);
        mapping.put('V', 5);
        mapping.put('I', 1);
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int val1 = mapping.get(s.charAt(i));
            int val2 = mapping.get(s.charAt(i + 1));
            if(val1 >= val2) {
                result += val1;
            } else {
                result -= val1;
            }
        }
        result += mapping.get(s.charAt(s.length() - 1));
        return result;
    }
}
