package com.example.easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution_20 {
    public boolean isValid(String s) {
        Map<Character, Character> lrmapping = new HashMap<>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};
        LinkedList<Character> stack = new LinkedList<>();
        for (Character c : s.toCharArray()) {
            if(lrmapping.containsValue(c)) {
                stack.push(c);
            } else if(lrmapping.containsKey(c)) {
                Character target = lrmapping.get(c);
                if(target != stack.poll()) return false;
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }
}
