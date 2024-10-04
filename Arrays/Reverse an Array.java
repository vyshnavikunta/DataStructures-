/*
Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that the first element becomes the last, the second element becomes second last and so on.

Examples:

Input: arr[] = {1, 4, 3, 2, 6, 5}  
Output: {5, 6, 2, 3, 4, 1}
Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.


Input: arr[] = {4, 5, 1, 2} 
Output: {2, 1, 5, 4}
Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
*/

//Using temporary Array
//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int[] tmp = new int[n];
        for(int i=0;i<n;i++)
            tmp[i] = arr[n-i-1];
        for(int i=0;i<n;i++)
            arr[i] = tmp[i];
        
    }
}

//Using two pointer Technique
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int p1 =0,p2=n-1;
        while(p1 <= p2){
            int tmp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = tmp;
            p1++;
            p2--;
        }
        
        
    }
}

//Using Swapping - We may get TLE
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        
        for(int i=0;i<n/2;i++){
            int tmp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = tmp;
           
        }
        
        
    }
}
