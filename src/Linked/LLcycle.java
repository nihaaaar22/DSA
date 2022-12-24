package Linked;

public class LLcycle {
    public static void main(String[] args) {

    }
    static boolean isCycle(LL a){
        LL.Node fast = a.head;
        LL.Node slow = a.head;
        while(fast.next!= null && fast!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;


    }
    static int lengthOfCycle(LL a){

        if(!isCycle(a)){return 0;}

        int count = 0;

        LL.Node fast = a.head;
        LL.Node slow = a.head;

        while(fast.next!= null && fast!= null){

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                break;
            }
        }
        do{
            slow = slow.next;
            count+=1;
        }
        while (slow!= fast);
        return count;
    }
    static LL.Node cycleStart(LL a){

        LL.Node first = a.head;
        LL.Node sec = a.head;

        int l = lengthOfCycle(a);

        int temp = 0;

        while(temp!=l){
            sec= sec.next;
            temp ++;
        }
        while(first!=sec){
            first = first.next;
            sec = sec.next;
        }
        return sec;



    }
}
