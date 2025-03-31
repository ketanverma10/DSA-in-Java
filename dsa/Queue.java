package dsa;


public class Queue {

    private Node first;
    private Node last;
    private int length;
 
    public class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value=value;
            this.next=null;
        }

    }
    public Queue(int value){
        Node newnode=new Node(value);
        first=newnode;
        last=newnode;
        length=1;

    }

    public boolean isNull(){
        return first==null;
    }

    public void  getFirst(){
        if(first==null){
            System.out.println("there is nothing to show");
        }
        else{
            System.out.println("Value is : " + first.value);
        }
    }
    public void getLast(){
        if(last==null){
            System.out.println("there is nothing to show");
        }
        else{
            System.out.println("Value is : " + last.value);
        }
    }
    public int length(){
        return length;
    }

    public void printQueue(){
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp=temp.next;
           }
           System.out.print("null");
           System.out.println();

    }
    public void Enqueue(int value){
        Node newnode=new Node(value);
        if(isNull()){
            first=newnode;
            last=newnode;
        }
        else{
            last.next=newnode;
            last=newnode;
        }
        length++;
        
    }
    public Node Dequeue(){
       if(isNull()) return null;
       Node temp=first;
        if(length==1){
            first=null;
            last=null;
        }
        else{
            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }
}
