package datastructures;
public class Queue {
    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    private Node first;
    private Node last;
    public Queue(int val){
        Node newnode = new Node(val);
        first = newnode;
        last = newnode;
    }

    public void enqueue(int val){
        Node newnode = new Node(val);
        if(first == null){
            first = newnode;
            last = newnode;
        }else{
            last.next = newnode;
            last = newnode;
        }
    }
    public int dequeue(){
        if (first == null){
            System.out.println("The queue is empty");
            return 0;
        }else{
        int data = first.val;
        first = first.next;
        return data;
        }
    }
    public void showQueue(){
        Node temp = first;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
