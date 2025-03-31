import dsa.*;


public class Main {
    public static void main(String[] args) {
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
        System.out.println();
        ll.printList();


        //#region doublylink list 
        System.out.println("Doubly link List ");
        DoublyLinkedList dd= new DoublyLinkedList(0);
        dd.append(2);
        dd.prepend(3);
        dd.printList();
        dd.Remove(1);
        dd.printList();

        ////#endregion
    }
}
