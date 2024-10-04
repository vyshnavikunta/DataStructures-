/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int first = firstOcc(nums, target);
        int last = lastOcc(nums, target);
        ans[0] = first;
        ans[1] = last;
        return ans;
    }
    public static int firstOcc(int[] nums,int tar){
        int l = 0, h = nums.length-1;
        int first = -1;
        while(l<= h){
            int mid = (l+h)/2;
            if(nums[mid] == tar){
                first = mid;
                h = mid-1;
            }else if(nums[mid] < tar){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return first;
    }

    public static int lastOcc(int[] nums,int tar){
        int l = 0, h = nums.length-1;
        int last = -1;
        while(l<= h){
            int mid = (l+h)/2;
            if(nums[mid] == tar){
                last = mid;
                l = mid+1;
            }else if(nums[mid] < tar){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }
        return last;
    }
}






