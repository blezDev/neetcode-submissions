class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty()&& ch  == ')'  ){
                if(  stack.pop() != '(')
                return false;
            }
            else if(!stack.isEmpty() && ch == '}' ){
                if( stack.pop() != '{')
                return false;
            } 
            else if(!stack.isEmpty() && ch == ']'){
                if(stack.pop() != '[')
                return false;
            }
            else {
                stack.add(ch);
            }

        } 
        return stack.isEmpty();
    }
}
