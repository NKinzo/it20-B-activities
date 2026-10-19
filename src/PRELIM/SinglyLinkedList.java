
package PRELIM;
import java.util.LinkedList;
public class SinglyLinkedList {
    
    class Node {
    
        int data;
        Node next;
    
        Node (int data){
            this.data = data;
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
    }
    //displays the list
    void display(){
        Node current = head;
        
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println( "null");
    }
    
    
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(60);
        list.add(90);
        
        list.display();
        
        
    }
    
}
