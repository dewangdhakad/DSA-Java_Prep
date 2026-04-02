// 🔹 Create Target Array in the Given Order
// 🔹 Platform: LeetCode
// 🔹 Link: https://leetcode.com/problems/create-target-array-in-the-given-order/description/

// 🧠 Approach:
// use the for loop to put the value at given index.
// if the index is less the value i of loop the shift the array accordingly to insert element at right position,

// ⏱ Time Complexity: O(n^2)
// 📦 Space Complexity: O(n)

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int l = nums.length;
        int[] ans = new int[l];
        for(int i =0 ; i<l;i++){
            if(i>index[i]){
                ans = Shift(ans , index[i] , l);
                ans[index[i]] = nums[i];
            }
            else{
            ans[index[i]] = nums[i];
            }
        }
        return ans;
    }
    public int[] Shift(int[] arr , int start ,int lenght){
        for(int i = lenght; i>start ; i--){
            if(i-2<0) arr[i-1] = 0;
            else arr[i-1] = arr[i-2];
        }
        return arr;
    }
}