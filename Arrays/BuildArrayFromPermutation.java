// 🔹 Problem: Build Array from Permutation
// 🔹 Platform: LeetCode
// 🔹 Link: https://leetcode.com/problems/build-array-from-permutation/description/
// 🔹 Difficulty: Easy

// 🧠 Approach:
// Create an array ans to store new array.
// Store element in it using formula ans[i] = nums[nums[i]].

// ⏱ Time Complexity: O(n)
// 📦 Space Complexity: O(n)

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = nums[nums[i]];
        }
    return ans;
    }
    }
