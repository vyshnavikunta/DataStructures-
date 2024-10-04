/*
Given an array arr of size n which contains elements in range from 0 to n-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1]. 

Examples:

Input: n = 4, arr[] = [0,3,1,2]
Output: -1
Explanation: There is no repeating element in the array. Therefore output is -1.
Input: n = 5, arr[] = [2,3,1,2,3]
Output: 2 3 
Explanation: 2 and 3 occur more than once in the given array.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:

1 <= n <= 105
0 <= arr[i] <= 105, for each valid i
*/
class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i: arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
       
        for(Map.Entry<Integer,Integer> en: hm.entrySet()){
            if(en.getValue() > 1){
                ans.add(en.getKey());
            }
        }
        Collections.sort(ans);
        if(ans.isEmpty())
        ans.add(-1);
        return ans;
    }
}
