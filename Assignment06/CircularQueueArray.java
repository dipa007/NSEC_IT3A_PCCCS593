import java.util.*;
public class CircularQueueArray {
    static class CQueue {
        int[] q; int front=0,rear=0,sz=0;
        CQueue(int n){ q=new int[n]; }
        void enqueue(int x){ if(sz==q.length) System.out.println("Overflow"); else { q[rear]=x; rear=(rear+1)%q.length; sz++; } }
        int dequeue(){ if(sz==0){ System.out.println("Underflow"); return -1; } int v=q[front]; front=(front+1)%q.length; sz--; return v; }
        void display(){ for(int i=0;i<sz;i++) System.out.print(q[(front+i)%q.length]+" "); System.out.println(); }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CQueue qu=new CQueue(100);
        while(sc.hasNext()){
            String op=sc.next();
            if(op.equalsIgnoreCase("enq")) qu.enqueue(sc.nextInt());
            else if(op.equalsIgnoreCase("deq")) System.out.println(qu.dequeue());
            else if(op.equalsIgnoreCase("display")) qu.display();
            else if(op.equalsIgnoreCase("exit")) break;
        }
        sc.close();
    }
}
