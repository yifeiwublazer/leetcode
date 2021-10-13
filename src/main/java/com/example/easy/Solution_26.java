package com.example.easy;

public class Solution_26 {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
