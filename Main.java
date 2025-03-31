import dsa.*;


public class Main {
    public static void main(String[] args) {

        System.out.println(" linked List ");

        LinkedList ll =new LinkedList(1);
        ll.append(2);
        ll.append(3);
        ll.printList();
        System.out.println();
        System.out.println(ll.get(2).value);
        ll.set(1,4);
        ll.printList();
        ll.removeFirst();
        ll.printList();
        ll.reverse();
        ll.printList();


        //#region doublylink list 
        System.out.println("Doubly link List ");
        DoublyLinkedList dd= new DoublyLinkedList(0);
        dd.append(2);
        dd.prepend(3);
        dd.printList();
        dd.Remove(1);
        dd.printList();

        //#endregion
        

         //#region stack
        System.out.println("stack");
         Stack ss= new Stack(2);

         ss.push(1);
         ss.printStack();


         //#endregion
        
    }
}
