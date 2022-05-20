class Solution {
    public boolean isValid(String s) {
        Stack<Character>res=new Stack<>();
        
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='(')
                res.push(')');
            else if (s.charAt(i)=='{')
                res.push('}');
            else if (s.charAt(i)=='[')
                res.push(']');
            else if (res.isEmpty() || res.pop()!=s.charAt(i))
                return false;
        }
        return res.isEmpty();
    }
}