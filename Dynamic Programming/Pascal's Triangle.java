/* Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

*/
 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]
 

Constraints:

1 <= numRows <= 30

class Solution {
    public List<List<Integer>> generate(int r) {
        if(r == 0){
            return new ArrayList<>();
        }
        if(r == 1){
            List<List<Integer>> ro = new ArrayList<>();
            ro.add(Arrays.asList(1));
            return ro;
        }
        List<List<Integer>> r1 = generate(r-1);
        List<Integer> r2 = new ArrayList<>();
        for(int i=0;i<r;i++){
            r2.add(1);
        }
        for(int i=1;i<r-1;i++){
            r2.set(i,r1.get(r-2).get(i-1)+r1.get(r-2).get(i));
        }
        r1.add(r2);
        return r1;
    }
}
