package com.example.medium;

import java.util.ArrayList;

public class Solution_6 {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        ArrayList<StringBuilder> rows = new ArrayList<>();
        for(int i = 0; i < Math.min(numRows, s.length()); i++) rows.add(new StringBuilder());
        int currRow = 0;
        boolean goDown = false;
        for(int i = 0; i < s.length(); i++){
            rows.get(currRow).append(s.charAt(i));
            if(currRow == 0 || currRow == numRows - 1) goDown = !goDown;
            currRow += goDown ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows) result.append(row);
        return result.toString();
    }
}
