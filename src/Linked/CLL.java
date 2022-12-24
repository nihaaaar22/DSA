package Linked;

public class CLL {
    public static void main(String[] args) {
        CLL one = new CLL();
        one.insertAtLast(12);
        one.insertAtLast(14);
        one.insertAtLast(13);
        one.insertAtLast(134);
        one.insertAtLast(15);
        one.display();

    }
    Node head;
    Node tail;
    int size = 0;
    void insertAtLast(int value){
        Node node = new Node(value);
        if(head==null){
            head = node;
            tail = node;
        }
        size++;
        tail.next = node;
        node.prev = tail;
        tail = node;
        tail.next = head;
        head.prev = tail;


    }
    void display(){
        Node temp = head;
        do {
            System.out.println(temp.value);
            temp = temp.next;
        }
        while(temp != head);
        System.out.println(temp.value);
    }
    private class Node{
        Node next;
        Node prev;
        int value;
        Node(int value){
            this.value = value;
        }

    }
}
