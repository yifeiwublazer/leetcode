package com.example.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_17 {

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0) return res;
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backTrace(0,"", map, res, digits);
        return res;
    }

    public void backTrace(int index, String currStr, Map<Character,String> map, List<String> res, String digits) {
        if(currStr.length() == digits.length()) {
            res.add(currStr);
            return;
        }
        String temp = map.get(digits.charAt(index));
        for (int i = 0; i < temp.length(); i++) {
            backTrace(index + 1, currStr + temp.charAt(i), map, res, digits);
        }
    }
}
