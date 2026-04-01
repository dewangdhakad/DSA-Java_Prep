// 🔹 Problem: Kids With the Greatest Number of Candies
// 🔹 Platform: LeetCode
// 🔹 Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
// 🔹 Difficulty: Easy

// 🧠 Approach:
// Create a variable that store highest number of candies as GreatestNo function is used.
// After getting highest number of candies compare the candies of each child + extra candies to highest candies.
// Now return if true and flase according to result of last step.

// ⏱ Time Complexity: O(n)
// 📦 Space Complexity: O(n)

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestNo = GreatestNo(candies);
        List<Boolean> arr = new ArrayList<>(candies.length);
        for(int i = 0 ; i< candies.length ; i++){
            arr.add(Compare(candies[i],greatestNo,extraCandies));
        }
        return arr;
        }
    public int GreatestNo (int[] candies){
        int n=0;
        for(int a : candies){
            if(a>n)
            n=a;
        }
        return n;
    }
    public boolean Compare(int candies , int greatest,int extra){
        if(candies+extra>= greatest) return true;
        else return false;
    }
}