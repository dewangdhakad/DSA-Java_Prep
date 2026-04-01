// 🔹 Problem: Number of Good Pairs
// 🔹 Platform: LeetCode
// 🔹 Link: https://leetcode.com/problems/number-of-good-pairs/description/
// 🔹 Difficulty: Easy

// 🧠 Approach:
// create a count variable.
// now run a loops to find equal numbers.
// if equal number found then increase count then return it.

// ⏱ Time Complexity: O(n^2)
// 📦 Space Complexity: O(n)

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int i =0 ; i< nums.length ; i++){
            for(int j = i+1 ; j<nums.length ; j++){
                if(nums[i] == nums[j]) count++;
            }
        }
        return count;
    }
}