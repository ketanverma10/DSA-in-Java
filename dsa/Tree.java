package dsa;

public class Tree {
    
    public Node root;
    public class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value){
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }

    public boolean Insert(int value){
        Node newnode=new Node(value);
        if(root==null){
            root=newnode;
            return true;
        }
        Node temp=root;
        while(true){
            if(temp.value==value) return false;
            else if(temp.value>value){
                if(temp.left==null){
                    temp.left=newnode;
                    return true;
                }
                temp=temp.left;
            }
            else{
                if(temp.right==null){
                    temp.right=newnode;
                    return true;
                }
                temp=temp.right;
            }


        }
    }

    public boolean Contains(int value){
        Node temp=root;
        while(temp!=null){
            if(temp.value>value){
                temp=temp.left;                    
            }
            else if(temp.value<value){
                temp=temp.right;
            }
            else{
                return true;
            }
        }
        return false;
    }



}
