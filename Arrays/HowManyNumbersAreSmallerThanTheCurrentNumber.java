// 🔹 Problem: How Many Numbers Are Smaller Than the Current Number
// 🔹 Platform: LeetCode
// 🔹 Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
// 🔹 Difficulty: Easy

// 🧠 Approach:
// Run a loop where it itterate i among value of given array.
// now run a inside loop where we compare the value at index j to value in index i.
// now for everytime increase the value of count and then return it.

// ⏱ Time Complexity: O(n^2)
// 📦 Space Complexity: O(n)

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int count =0;
            for(int j =0 ; j < n;j++){
                if(nums[j]<nums[i]) count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}