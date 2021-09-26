package com.example.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution_3 {
    public int lengthOfLongestSubstring1(String s) {
        int len = s.length(), ans = 0;
        int right = 0, left = 0;
        Set<Character> charSet = new HashSet<>();
        while(right < len) {
            while(charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }

    public int lengthOfLongestSubstring2(String s) {
        int len = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int j = 0, i = 0; j < len; j++){
            if(map.containsKey(s.charAt(j))) i = Math.max(map.get(s.charAt(j)),i);
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j),j + 1);
        }
        return ans;
    }
}
