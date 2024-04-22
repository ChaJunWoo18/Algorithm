import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] sArr = s.toCharArray();
       
        Stack stack = new Stack();
        for(int i=0;i<sArr.length;i++) {
            boolean checker = true;
            if(i!=0) 
                sArr = rotate(sArr);
            for(int j=0;j<sArr.length;j++) {
                if(sArr[j]==')' || sArr[j]=='}' || sArr[j]==']') {
                    if(stack.isEmpty()) {
                        checker = false;
                        break;
                    } else {
                        if(stack.peek()-sArr[j]<=-1) {
                            stack.pop();
                        } else {
                            checker = false;
                            break;
                        }
                    }
                }
                else {
                    stack.push(sArr[j]);
                }
            }

            if(checker && stack.isEmpty())
                answer++;
            stack.clear();
        }
        return answer;
    }
    public char[] rotate(char[] arr) {
        char tmp = arr[0];
        for(int i=1;i<arr.length;i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = tmp;
        return arr;
    }
}
class Stack{
    LinkedList<Character> stack;
    public Stack() {
        stack = new LinkedList<>();
    }
    public void push(char s) {
        stack.add(s);
    }
    public void pop() {
        stack.remove(stack.size()-1);
    }
    public char peek() {
        return stack.get(stack.size()-1);
    }
    public boolean isEmpty() {
        if(stack.size()==0)
            return true;
        return false;
    }
    public String toString() {
        return stack.toString();
    }
    public void clear() {
        stack.clear();    
    }
}
