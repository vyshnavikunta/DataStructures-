/*
You are given head of the non-empty sorted linked list where the value of the 
𝑖
𝑡
ℎ
i 
th
  node will be 
𝐴
𝑖
A 
i
​
 .

Your task is to delete all duplicates such that each element appears only once and return the linked list sorted.

Input:
First line will contain 
𝑇
T, number of test cases. Then the test cases follow.
The first line contains one integer 
𝑁
N — the length of the linked list.
The second line contains 
𝑁
N space separated integers 
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
  — the value of the linked list nodes starting from the head for the linked list.
Note:

For Java language, you need to:
Complete the function in the submit solution tab:

Node removeDuplicates(Node head){...}
  */

/* Linked List Node
struct Node {
    int data;
    struct Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}; */

class Solution {
    Node removeDuplicates(Node head) {
        // your code here
        if(head == null || head.next == null){
            return head;
        }
        Node prev = head;
        Node curr = head;
        while(prev != null){
            while(curr != null && curr.data == prev.data){
                curr = curr.next;
            }
            prev.next = curr;
            prev = prev.next;
            if(prev != null){
                curr = prev.next;
            }
            // if(head.next.data != head.data){
            //     head = head.next;
            // }else{
            //     head.next=head.next.next;
            // }
        }
        return head;
    }
};
























