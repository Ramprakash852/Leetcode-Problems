class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder result=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(ch=='(' && st.isEmpty()) st.push(ch);
            else if (ch=='(') {
                result.append(ch);
                st.push(ch);
            }
            else if(ch==')' && st.size()==1) st.pop();
            else {
                result.append(ch);
                st.pop();
            }
        }
        return result.toString();
    }
}