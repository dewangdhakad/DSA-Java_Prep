// 🔹 Problem: Shuffle the Array
// 🔹 Platform: LeetCode
// 🔹 Link: https://leetcode.com/problems/shuffle-the-array/description/
// 🔹 Difficulty: Easy

// 🧠 Approach:
// Create a new array to store shuffled array.
// Insert element in arr array as first number is xi and second is yi.
// Formuls used to store elements arr[i] = nums[j]; arr[i+1] = nums[j+n];

// ⏱ Time Complexity: O(n)
// 📦 Space Complexity: O(n)

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i = 0 , j =0 ; i< nums.length ; i+=2 ,j++){
            arr[i] = nums[j];
            arr[i+1] = nums[j+n];
        }
        return arr;
    }
}