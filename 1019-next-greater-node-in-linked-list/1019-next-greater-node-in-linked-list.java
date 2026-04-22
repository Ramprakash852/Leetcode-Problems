/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp=head;
        while (temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int[] result = new int[list.size()];
        Arrays.fill(result,0);
        Stack<Integer> st = new Stack();
        for(int i=0; i<list.size();i++){
            while (!st.isEmpty() && list.get(i)>list.get(st.peek())){
                result[st.peek()]=list.get(i);
                st.pop();
            }
            st.push(i); 
        }
        return result;
    }
}