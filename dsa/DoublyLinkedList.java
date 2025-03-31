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
                System.out.print(temp.value + "-->");
                temp=temp.next;
            }
            System.out.print("null");
            System.out.println();

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
        Node temp=head;
        if(index <length/2){
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
        }
        else{
            temp=tail;
            for(int i=length-1;i>index;i--){
                temp=temp.prev;
            }
        }
        return temp;
    }
    public boolean set(int index,int value){
        Node temp= get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }
        return false;
    }
    public boolean insert(int index,int value){
        if (index < 0 || index >= length) return false;
        if(index==0){
            prepend(value);
            return true;
        }

        if(index==length){
            append(value);
            return true;
        }
        Node newnNode = new Node(value);
        Node before=get(index-1);
        Node after=before.next;
        before.next=newnNode;
        after.prev=newnNode;
        newnNode.prev=before;
        newnNode.next=after;
        length++;
        return true;

    }
    public Node Remove(int index){
        if(index<0||index>length) return null;
        if(index==0) {
           return  removeFirst();
        }
        if(index==length-1) return removeLast();
        Node temp=get(index);
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.prev=null;
        temp.next=null;
        length--;
        return null;

    }
    
}

