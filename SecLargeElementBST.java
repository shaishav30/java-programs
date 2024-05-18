class Node{
    int value;
    Node left;
    Node right;

    Node(int value){
        this.value = value;
        left = right = null;
    }
}

class BinarySearchTree{
    Node root;

    BinarySearchTree(){
        root = null;
    }

    public Node insert(Node node, int value){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value)
            node.left = insert(node.left,value);

        if(value > node.value)
            node.right = insert(node.right,value);

        return node;
    }

    public Node search(Node root, int value){
        if(root == null || root.value == value)
            return root;

        if(value < root.value)
            return search(root.left,value);
        else
            return search(root.right,value);
    }
}

public class SecLargeElementBST {
    public static void main(String[] args) {
        
    }
    
}
