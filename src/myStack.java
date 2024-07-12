public class myStack {
    private class Node{
        private int val;
        private Node next;
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    private Node top;
    public myStack(int val){
        Node newnode = new Node(val, null);
        top = newnode;
    }
    public void push(int val){
        Node newnode = new Node(val, null);
        if(top == null){
            top = newnode;
        }else{
            newnode.next = top;
            top = newnode;
        }
    }
    public int pop(){
        if(top == null){
            System.out.println("The stack is empty");
            return 0;
        }else{
            int popped = top.val;
            top = top.next;
            return popped;
        }
    }
    public void display(){
        Node temp = top;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
