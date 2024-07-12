public class App {
    public static void main(String[] args) throws Exception {
        //linked list try out
        System.out.println("Linked list!!");
        LinkedList linkedlist = new LinkedList(1);
        linkedlist.append(2);
        linkedlist.append(3);
        linkedlist.insert(4, 2);
        linkedlist.display();
        System.out.println("Execution complete, now reversing!");
        linkedlist.reverselist();
        linkedlist.display();
        
        //Stacks
        System.out.println("Stacksss");
        myStack stack = new myStack(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.display();

        //Queues
        System.out.println("Queeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        Queue q = new Queue(0);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.showQueue();
        System.out.println("Dequeued element : " + q.dequeue());
        q.showQueue();

        //Sets try outs!
        //Java has inbuilt sets and they are the only ones that can be used.

        //Binary Tree
        System.out.println("Binary treees, but wo a display method");
        //make a display method for this DS!!!!!
        binaryTree btree = new binaryTree(10);
        btree.addToTree(5);
        btree.addToTree(15);
        btree.addToTree(3);
        btree.addToTree(7);
        btree.addToTree(13);
        btree.addToTree(16);
        System.out.println(btree.lookUp(7));
        System.out.println(btree.lookUp(9));

        //Max heap
        //Heaps are executed in form of arrays.

        //Min heap

    }
}