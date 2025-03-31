package dsa;



public class Stack {
    
    private int height;
    private Node top;

    public class Node{
        public int value ;
        public Node next;

        public Node(int value){
            this.value=value;
            this.next=null;
        }
    }

    public Stack(int value){
        Node newnode=new Node(value);
        top=newnode;
        height=1;
    }
    public boolean isNull(){
        return top==null;
    }
    public void printStack(){
        if(isNull()){
            System.out.println("stack is empty");
        }
        else{
            Node temp=top;
            while(temp!=null){
                System.out.print(temp.value + "-->");
                temp=temp.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }
    public void getTop(){
        if(top==null){
            System.out.println("there is nothing to show");
        }
        else{
            System.out.println("Value is : " + top.value);
        }
    }
    public int getHeight(){
        return height;
    }

    public void push(int value){
        Node newnode=new Node(value);
        if(isNull()){
            top=newnode;
        }
        else{
            newnode.next=top;
            top=newnode;
        }
        height++;
    }
    public Node pop(){
        if(isNull()) return null;
        
       Node temp=top;
       top=top.next;
       temp.next=null;
       height--;
       return temp;
    }
}
