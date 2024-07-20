/*
Given the head of a linked list, Find the number of critical points. (The starting and end are not considered critical points).

Local minima or maxima are called critical points.

A Node is called a local minima if both next and previous elements are greater than the current element.

A Node is called a local maxima if both next and previous elements are smaller than the current element.

Constraints
1≤1≤ Number of elements in the linked list , 𝑁
N ≤105
≤10 5
 
1
≤
𝑁
𝑜
𝑑
𝑒
.
𝑑
𝑎
𝑡
𝑎
≤
1
0
9
1≤Node.data≤10 
9
Sample 1:
Input
Output
8
1 2 3 3 3 5 1 3
2 
Explanation:
1 is a minima and 5 is a maxima hence there are 2 critical points

Sample 2:
Input
Output
7
1 2 3 2 1 3 2 
3
Explanation:
3rd node, 5th node and 7th node are the critical nodes, hence the answer is 3
*/

// Node is defined as:
// class Node{
//     int val;
//     Node next;
//     Node(int x){
//     	val = x; next = null;
//     }
// }
class Solution{
    static int solve(Node root){
        int cnt = 0;
        if(root == null || root.next == null){
            return 0;
        }
        Node prev = root;
        Node curr = root.next;
        while(curr != null && curr.next != null){
            if(curr.val < prev.val && curr.val <curr.next.val){
                cnt ++;
            }else if(curr.val > prev.val && curr.val > curr.next.val){
                cnt ++;
            }
                prev = curr;
                curr = curr.next;
            
            
        }
        return cnt;
    }
}
