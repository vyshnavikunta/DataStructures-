/*
You are given the head of a singly linked list 
𝐴
A of length 
𝑁
N. The values in the list are 
𝐴
1
,
𝐴
2
,
…
,
𝐴
𝑁
A 
1
​
 ,A 
2
​
 ,…,A 
N
​
  respectively. You need to find the value of the middle element of the linked list.

The middle element of a linked list of length 
𝑁
N is the 
(
⌊
𝑁
2
⌋
+
1
)
(⌊ 
2
N
​
 ⌋+1)-th element from the head of the list.

Input Format
The first line of the input contains a single integer 
𝑇
T - the number of test cases. The description of 
𝑇
T test cases follows.

The first line of each test case contains a single integer 
𝑁
N.

The second line of each test case contains 
𝑁
N space-separated integers 
𝐴
1
,
𝐴
2
,
…
,
𝐴
𝑁
A 
1
​
 ,A 
2
​
 ,…,A 
N
​
 .

Output Format
For each test case, the function you complete should return the value of the middle element of the list.
Note: You need to complete the function getMiddleElement to solve the problem.

Constraints
1
≤
𝑇
≤
100
1≤T≤100
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
  for each valid 
𝑖
i
the sum of 
𝑁
N over all test cases does not exceed 
2
⋅
1
0
5
2⋅10 
5
*/
/*class Node{
    int val;
    Node next;
    Node(int x){
    	val = x; next = null;
    }
}*/

static int getMiddleElement(Node head){
    if(head == null){
        return head.val;
    }
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow.val;
    
     
}
