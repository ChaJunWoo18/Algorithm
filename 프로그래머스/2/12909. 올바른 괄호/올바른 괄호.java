class Solution {
    boolean solution(String s) {
        NodeManager nm = new NodeManager();
        for(int i=0;i<s.length();i++) {
            String bracket = s.substring(i,i+1);
            if(bracket.equals("(")) {
                nm.push("(");
            }
            else {
                if(nm.isEmpty())
                    return false;
                else if(!nm.isEmpty() && nm.peek().equals("("))
                    nm.pop();
            }
        }
        if(!nm.isEmpty()) 
            return false;
        return true;
    }
}
class Node {
    String item;
    Node node;
    public Node(String item) { 
        this.item = item;
        node = null;
    }
    protected void linkNode(Node node) {
        this.node = node;
    }
    protected Node getNextNode(){
        return this.node;
    }
    protected String getData() {
        return this.item;
    }
}
class NodeManager {
    Node top; 
    
    public NodeManager() {
        this.top = null;
    }
    public void push(String data) {
        Node node = new Node(data);
        node.linkNode(top);
        top = node;
    }
    public void pop() {
        top = top.getNextNode();
    }
    public String peek() {
        return top.getData();
    }
    public boolean isEmpty() {
        return top == null;
    }
}