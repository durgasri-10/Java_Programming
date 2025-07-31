class Node {
    int data; 
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }                                                                               
} 
class MyLinkedList {
    Node head;
    public void insertionAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class LinkedlistInsertion { 
    public static void main(String[] args) {
        MyLinkedList ls = new MyLinkedList();
        ls.insertionAtEnd(10);
        ls.insertionAtEnd(20);
        ls.insertionAtEnd(30);
        ls.insertionAtEnd(40);
        ls.display();
    }
} 

