
package PRELIM;
import java.util.LinkedList;
public class DoublyLinkedList {
    
    class Node {
    
        int data;
        Node previous;
        Node next;
    
        Node (int data){
            this.data = data;
            this.previous = null;
            this.next = null;
        }

    }   
    Node head; 
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.previous = current;
    }
    //displays the list
    void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println( "null");
    }
    
    
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(60);
        list.add(70);
        
        list.display(); 
        
        
    }
    
}
