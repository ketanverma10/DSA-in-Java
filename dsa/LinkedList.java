package dsa;

public class LinkedList{

    private Node head;
    private Node tail ;
    private int length;

    public class Node{
        public int value;
        public Node next;
        
        public Node(int value){
            this.value=value;
            this.next=null;
        }
    }
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public boolean isNull(){
        return head==null;
    }
    public void getHead(){
        if(head==null){
            System.out.println("there is nothing to show");
        }
        else{
            System.out.println("Value is : " + head.value);
        }
    }
    public void getTail(){
        if(head==null){
            System.out.println("there is nothing to show");
        }
        else{
            System.out.println("Value is : " + tail.value);
        }
    }
    public void printList(){
        if(isNull()){
            System.out.println("List is Null");
        }
        else{
           Node temp=head;
           while (temp!=null) {
            System.out.print(temp.value + "-->");
            temp=temp.next;
           }
        }
    }
    public int getLength(){
        return length;
    }
    public void append(int value){
        Node newnode=new Node(value);
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
        length++;

    }
    public void prepend(int value){
        Node newnode=new Node(value);
        if(isNull()){
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
        length++;
    }
    public Node removeLast(){
        if(isNull()){
            System.out.println(
                "list is empty"
            );
            return null;
        }
        Node temp=head;
        Node prev=head;

        while(temp.next!=null){
            prev=temp;
            temp=temp.next;

        }
        tail=prev;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }

    public Node removeFirst(){
        if(isNull()) return null;
        Node temp=head;
        head=head.next;
        temp.next=null;
        length--;
        if(length==0){
            tail=null;
        }
        return null;
    }
    public Node get(int index){
        if(index<0 || index>=length) return null;
        Node temp= head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public boolean set(int index,int value){
       Node temp=get(index);
       if(temp!=null){
        temp.value=value;
        return true;
       }
       return false;
    }
    public boolean insert(int index,int value){
        if(index<0 || index>length) return false;
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }
        Node newnode = new Node(value);
        Node temp=get(index-1);

        newnode.next=temp.next;
        temp.next=newnode;
        length++;
        return true;


    }

    public Node remove(int index,int value){
        if(index<0 || index>length) return null;
        if(index==0){
            return  removeFirst();
        }
        if(index==length-1){
            return removeLast();
        }
        Node prev=get(index-1);
        Node temp=prev.next;

        prev.next=temp.next;
        temp.next=null;
        length--;
        return temp;

    }

    public void reverse(){
        Node temp=head;
        head=tail;
        tail=temp;
        Node after=temp.next;
        Node before=null;
        for(int i=0;i<length;i++){
            after=temp.next;
           temp.next=before;
           before=temp;
            temp=after;
        }


    }
}