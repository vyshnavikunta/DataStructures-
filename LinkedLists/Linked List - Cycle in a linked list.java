/*
You are given a linked list 
𝐴
A of size 
𝑁
N.

Return the node where the cycle begins in the linked list. If there is no cycle, return NULL.

Input:
First line will contain 
𝑇
T, number of test cases. Then the test cases follow.
Each test case contains three lines of input.
First line contains an integer 
𝑁
N, length of the linked list 
𝐴
A.
Second line contains 
𝐴
1
,
𝐴
2
,
…
𝐴
𝑁
A 
1
​
 ,A 
2
​
 ,…A 
N
​
 , the value of the linked list nodes starting from the head for the linked list.
Third line contains an integer denoting the index of the node where the cycle starts.
Note:

For Java language, you need to:
Complete the function in the submit solution tab:

Node detectCycle(Node head){...}
 
 

For C++ language, you need to:
Complete the function in the submit solution tab:

Node* detectCycle(Node* head){...}
 
 

For Python language, you need to:
Complete the function in the submit solution tab:

def detectCycle(head):
Output:
The function you complete should return the required answer.

Constraints
1
≤
𝑇
≤
10
1≤T≤10
1
≤
𝑁
≤
1
0
5
1≤N≤10 
5
 
1
≤
𝐴
𝑖
≤
1
0
9
1≤A 
i
​
 ≤10 
9
 
Sample Input:
3
2
8 5
1
2
5 9
1
3
5 6 8
2
Sample Output:
8
5
6
*/
/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    public static Node detectCycle(Node head){
        // Add code here
        boolean iscycle = false;
        if(head == null && head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                iscycle = true;
                break;
            }
            
        }
        if(!iscycle){
            return null;
        }
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
