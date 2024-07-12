public class LinkedList{
    private node head;
    private node tail = null;

    private class node{
        int value;
        node next;
        public node(int value, node next){
            this.value = value;
            this.next = next;
        }
    }
    public LinkedList(int val){
        node headnode = new node(val, null);
        head = headnode;
        tail = headnode;
    }
    public node lastnode(){
        node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    public void append(int val){
        node newnode = new node(val, null);
        if (head == null){
            head = newnode;
            tail = newnode;
        }else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void display(){
        node temp = this.head;
        while (temp.next != null){
            System.out.println(temp.value);
            temp = temp.next;
        } 
        System.out.println(temp.value);
    }
    public void insert(int val, int pos){
        node newnode = new node(val, null);
        node temp = this.head;
        node right = new node(0, null);
        int ind = 1;
        while (ind != pos){
            temp = temp.next;
            ind++;
        }
        right = temp.next;
        temp.next = newnode;
        newnode.next = right;
    }
    public void removeNode(int pos){
        int ind = 1;
        node temp = this.head;
        while (ind != pos){
            temp = temp.next;
            ind++;
        }
        //continue here!
    }
    public void reverselist(){
        node curr = this.head;
        node prev = null;
        node next;
        while (curr != null){
            head = curr;
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
}