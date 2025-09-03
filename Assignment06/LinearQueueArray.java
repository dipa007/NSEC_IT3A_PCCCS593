import java.util.*;
public class LinearQueueArray {
    static class Queue {
        int[] q; int front=0,rear=-1,sz=0;
        Queue(int n){ q=new int[n]; }
        void enqueue(int x){ if(sz==q.length) System.out.println("Overflow"); else { rear++; q[rear]=x; sz++; } }
        int dequeue(){ if(sz==0){ System.out.println("Underflow"); return -1; } int v=q[front++]; sz--; return v; }
        void display(){ for(int i=0;i<sz;i++) System.out.print(q[front+i]+" "); System.out.println(); }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue qu=new Queue(100);
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
