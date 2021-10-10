package com.example.medium;

import java.util.Arrays;

public class Solution_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = 0;
        int closest = 0;
        Integer min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r) {
                int value = nums[i] + nums[l] + nums[r];
                if(value > target) {
                    diff = value - target;
                    r--;
                } else if(value < target) {
                    diff = target - value;
                    l++;
                } else {
                    return target;
                }
                if(diff < min) {
                    min = diff;
                    closest = value;
                }
            }
        }
        return closest;
    }
}
