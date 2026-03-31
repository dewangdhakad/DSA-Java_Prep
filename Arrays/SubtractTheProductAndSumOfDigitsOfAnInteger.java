// 🔹 Problem: Subtract the Product and Sum of Digits of an Integer
// 🔹 Platform: LeetCode
// 🔹 Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
// 🔹 Difficulty: Easy

// 🧠 Approach:
// Create two variable product and sum.
// Store the Product and Sum in there repective variable using a while loop.

// ⏱ Time Complexity: O(n)
// 📦 Space Complexity: O(1)
class Solution {
    public int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n = n / 10;
        }

        return product - sum;
    }
}