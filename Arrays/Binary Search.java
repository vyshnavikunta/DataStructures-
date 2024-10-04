/*
Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.

Examples:

Input: k = 4, arr= [1, 2, 3, 4, 5]  
Output: 3
Explanation: 4 appears at index 3.
Input: k = 445, arr= [11, 22, 33, 44, 55] 
Output: -1
Explanation: 445 is not present.
Expected Time Complexity: O(logn)
Expected Space Complexity: O(logn) 

Note: Try to solve this problem in constant space i.e O(1)

Constraints:
1 <= arr.size() <= 105
1 <= arr[i] <= 106
1 <= k <= 106

*/

class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int l=0,h = arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[mid] > k){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
}
