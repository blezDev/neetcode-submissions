class Solution {
    public boolean isValid(String s) {
        Stack<Character> soso = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                soso.push(c);
            }
            else {
                if (soso.isEmpty())
                    return false;
                char a = soso.pop();
                if (c == ')' && a != '(')
                return false;
                else if (c == '}' && a != '{')
                    return false;
                else if (c == ']' && a != '[')
                    return false;
            }
        }
        if (soso.isEmpty())
            return true;
        return false;
        
    }
}
