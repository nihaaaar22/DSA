package Linked;
public class Main
{
	public static void main(String[] args) {
		LL one = new LL();
		one.insertAtFirst(12);
				one.insertAtFirst(14);
		one.insertAtFirst(16);
		one.insertAtFirst(16);
        one.insertAtFirst(17);
        one.insertAtFirst(17);
		
		one.display();
        one.delduplicate();
        one.display();
        one.reverse();
        one.display(); 





	}
    static LL merge(LL one,LL two){

        LL.Node first = one.head;
        LL.Node sec = two.head;
        if(first == null){return two;}
        if(sec == null){return one;}
        LL ans = new LL();
        while(first != null && sec != null){
            if(first.value < sec.value){
                ans.insertlast(first.value);
                first = first.next;
            }
            else {
                ans.insertlast(sec.value);
                sec = sec.next;
            }


        }
        while(first != null ){
            ans.insertlast(first.value);
        }
        while (sec != null){
            ans.insertlast(sec.value);
        }
        return ans;

    }
}
 class LL{
    int size;
    Node head;
    Node tail;
    LL(){
        this.size = 0;}
        
        void insertAtFirst(int value){
            Node node = new Node(value);
            node.next = head;
            head = node;
            
            if(tail==null){
                tail = head;
            }
            size += 1;
            
        }
     void insertlast(int value){
         Node node = new Node(value);
         size++;
         tail.next = node;
         tail = node;

         if(head==null){
             head = node;
         }
     }
     void delduplicate(){
         Node temp = head;
         while (temp.next!=null){
             if(temp.next.value == temp.value){
                 temp.next = (temp.next).next;
                 size--;
             }else{
                 temp = temp.next;}


         }
         tail = temp;
         tail.next = null;
     }
        void display(){
            Node temp;
            temp = head;
            while(temp != null){
                System.out.print(temp.value + " - > ");
                temp = temp.next;
            }
            System.out.println("End");
            
        }
        void insertatindex(int val,int index){
        Node temp;
        temp = head;
        int currentInd = 0;
        while(currentInd != index-1){
            temp = temp.next;
            currentInd ++;
        }
        Node node =  new Node(val,temp.next);
        temp.next =node;
        size++;




        }
        void getNode(int index){
        Node node = head;
        for (int i = 1;i<=index;i++){
            node = node.next;
        }
            System.out.println(node.value);
        }
        //recursive reverse linkes list
       void reverse(Node node){
         if(node == tail){
             head = tail;
             return;
         }

         reverse(node.next);
         tail.next = node;


         tail = node;
         tail.next = null;

       }
       // reverse using iteration
      void reverse(){
        Node par = head;
        Node node = head.next;
        while(node != null){
            node.next = par;
            par = node;
            node = node.next;

        } 
      }

      public class Node{
        int value;
        Node next;
        
        Node(int value){
            this.value = value;
        }
        Node(int value,Node next){
            this.next = next;
            this.value = value;
        }
        
         
        
        
    
    }
}
    
    
    

