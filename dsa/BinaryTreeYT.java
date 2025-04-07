package dsa;

public class BinaryTreeYT {
    
    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public  Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            newnode.left=buildTree(nodes);
            newnode.right=buildTree(nodes);
            return newnode;

        }
    }
    public static void preorder(Node root){
        
        if(root==null){
            System.out.print("-1" + " ");
            return;
        }

        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inOrder(Node root){
        if(root==null){
            System.out.print("-1" + " ");
            return;
        } 
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public static void postorder(Node root){
        if(root==null){
            System.out.print("-1" + " ");
            return;
        } 
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.value + " ");
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
       
        Node root = tree.buildTree(nodes);
        System.out.println(root.value);

        preorder(root);
    }
 

}
