package Linked;
import java.util.Scanner;

public class Dll {
    Node head;
    int size = -1;
    Node tail;
    public static void main(String[] args) {
        Dll one = new Dll();
        int insertions;
        System.out.println("How many items do you want to insert :");
        Scanner sc = new Scanner(System.in);
        insertions = sc.nextInt();
        while(insertions>0){
            System.out.println("Enter the value :");
            int value = sc.nextInt();
            one.insertAtFirst(value);
            insertions--;
        }
        //one.delduplicate();
        one.display();
        one.disprev();
        one.delduplicate();
        one.display();
        System.out.println();
    }
    void display(){
        Node temp = head;
        System.out.println("the list is:");
        for (int i = 0; i <= size; i++) {
            System.out.print(temp.value + "- >");
            temp = temp.next;
        }
        System.out.println("end");
    }
    void insertAtFirst(int value){
        Node node = new Node(value);

        if(head==null){

            head = node;
            tail = node;
        }

            node.next = head;
            head.prev = node;  
            head = node;
            size ++;
    }
    void disprev(){

        Node temp = tail;

        System.out.println("the list in reverse is:");

        for (int i = size; i >= 0; i--) {
            System.out.print(temp.value + " < -");

            temp = temp.prev;
        }

        System.out.println("Start");


    }
    void insertlast(int value){
        Node node = new Node(value);
        size++;
        tail.next = node;
        node.prev = tail;
        tail = node;

        if(head==null){
            head = node;
        }
    }
    void delduplicate(){
        Node temp = head;
        while (temp.next!=null){
            if(temp.next.value == temp.value){
                temp.next = temp.next.next;
                temp.next.prev = temp;
                size--;
            }else{
                temp = temp.next;}


        }
        tail = temp;
        tail.next = null;
    }


    private class Node{
        private Node next;
        private Node prev;
        private int value;
        Node(int value){

            this.value = value;
        }

    }


}
