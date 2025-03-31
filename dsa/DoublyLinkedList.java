package dsa;


public class DoublyLinkedList{
    private int length;
    private Node head;
    private Node tail;

    public class Node{
        public int value;
        public Node next;
        public Node prev;

        public  Node(int value){
            this.value=value;
            this.next=null;
            this.prev=null;

        }
    }

    public DoublyLinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    public boolean isNull(){
        return head==null;
    }


    public void append(int value){
        Node newnode = new Node(value);
        if(isNull()){
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.prev=tail;
            tail.next=newnode;
            tail=newnode;
        }
        length++;
    }

    public void printList(){
        if(isNull()){
            System.out.println("list is empty");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.value);
                temp=temp.next;
            }
        }
    }

    public int getLength(){
        return length;

    }
    public Node getHead(){
        return head;
    }    
    public Node getTail(){
        return tail;
    }
    public Node removeLast(){
        if(isNull()) return null;
        Node temp=tail;
        if(length==1){
            head=null;
            tail=null;
        }   
        else{
            tail=tail.prev;
            tail.next=null;
            temp.prev=null;
        }
        return temp;

    }
    public void prepend(int value){
        Node newnode=new Node(value);
        if(isNull()){
            head=newnode;
            tail=newnode;
        }
        else{
            head.prev=newnode;
            newnode.next=head;
            head=newnode;
        }
        length++;
    }
    public Node removeFirst(){
        if(isNull()) return null;
        Node temp=head;
        if(length==1){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
            temp.next=null;
        }
        length--;
        return temp;

    }

    public Node get (int index){
        if (index < 0 || index >= length) return null;

    }
    
}

