// 🔹 Problem: Running Sum of 1d Array
// 🔹 Platform: LeetCode
// 🔹 Link: https://leetcode.com/problems/running-sum-of-1d-array/description/
// 🔹 Difficulty: Easy

// 🧠 Approach:
// Create a new variable Sum.
// Insert the Running sum Value using formula sum = sum + nums[i],

// ⏱ Time Complexity: O(n)
// 📦 Space Complexity: O(n)
class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length;i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
