// 🔹 Problem: Concatenation of Array
// 🔹 Platform: LeetCode
// 🔹 Link: https://leetcode.com/problems/concatenation-of-array/
// 🔹 Difficulty: Easy

// 🧠 Approach:
// Create a new array of size 2*n.
// Copy elements of original array twice using a loop.

// ⏱ Time Complexity: O(n)
// 📦 Space Complexity: O(n)

class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] ans = new int[2 * l];

        for (int i = 0; i < l; i++) {
            ans[i] = nums[i];
            ans[i + l] = nums[i];
        }

        return ans;
    }
}