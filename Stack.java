import java.util.EmptyStackException;

//Creating the Stack class
public class Stack<T> {

    //Class for node in stack
    private static class Node<T>{
        private T data;
        private Node<T> next;
        
        // Constructor for the node class
        public Node(T data){
            this.data = data;
        }
    }

    //Top to keep track of the top value of the stack
    private Node<T> top;


    public boolean isEmpty(){
        return top == null;   
    }
    public void push(T data){
        Node<T> newnode = new Node<>(data);
        if (isEmpty()){
            top = newnode;
        }else{
            newnode.next=top;
            top=newnode;
        }
    }

    public T pop(){
        T data = top.data;
        if(isEmpty()){
            throw new EmptyStackException();
        }else{
            data = top.data;
            top=top.next;
        }
        return data;
    }
}
