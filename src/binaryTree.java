public class binaryTree {
    private class Node{
        private int val;
        private Node left;
        private Node right;

        public Node(int val){
            this.val = val;
        }
    }

    private Node root;
    public binaryTree(int val){
        Node newnode = new Node(val);
        root = newnode;
    }
    public void addToTree(int val){
        Node newnode = new Node(val);
        Node temp = root;
        while(temp.left!=null && temp.right!=null){
            if(newnode.val < temp.val){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        if(newnode.val > temp.val){
            temp.right = newnode;
        }else{
            temp.left = newnode;
        }
    }
    public boolean lookUp(int val){
        Node temp = root;
        if(temp == null){
            return false;
        }else{
            while(temp!=null){
                if (val < temp.val) {
                    temp = temp.left;
                }else if(val > temp.val){
                    temp = temp.right;
                }else{
                    return true;
                }
            }
            return false;
        }
    }
    public void showTree(){
        //Continue here!
    }
}
