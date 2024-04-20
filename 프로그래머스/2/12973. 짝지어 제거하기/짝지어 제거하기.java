import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack stack = new Stack();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++) {
            char c = s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
                continue;
            }
            else{
                stack.push(c);
            }
        }
        if(stack.isEmpty())
            return 1;
        return 0;
    }
}
class Stack 
{
    private LinkedList<Integer> stack;
    
    public Stack() {
        stack = new LinkedList<>();
    }
    
    public void push(int n) {
        stack.addLast(n);
    }
    public int pop() {
        return stack.removeLast();
    }
    public int peek() {
        return stack.getLast();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}