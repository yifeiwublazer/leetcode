package com.example.medium;

public class Solution_31 {
    public void nextPermutation(int[] nums) {
        if(nums.length==1) return;
        int flag = -1;
        int pivot = -1;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i]-nums[i-1] > 0){
                flag=1;
                pivot=i-1;
                break;
            }
        }
        if(flag==-1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        for(int i=nums.length-1; i>pivot; i--){
            if(nums[i]>nums[pivot]){
                swap(nums, i, pivot);
                reverse(nums, pivot+1, nums.length-1);
                return;
            }
        }

    }
    public void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
        return;
    }
    public void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
        return;
    }
}
