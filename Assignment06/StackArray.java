import java.util.*;
public class StackArray {
    static class Stack {
        int[] s; int top=-1;
        Stack(int n){ s=new int[n]; }
        void push(int x){ if(top==s.length-1) System.out.println("Overflow"); else s[++top]=x; }
        int pop(){ if(top==-1){ System.out.println("Underflow"); return -1; } return s[top--]; }
        void display(){ for(int i=top;i>=0;i--) System.out.print(s[i]+" "); System.out.println(); }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack(100);
        while(sc.hasNext()){
            String op=sc.next();
            if(op.equalsIgnoreCase("push")) st.push(sc.nextInt());
            else if(op.equalsIgnoreCase("pop")) System.out.println(st.pop());
            else if(op.equalsIgnoreCase("display")) st.display();
            else if(op.equalsIgnoreCase("exit")) break;
        }
        sc.close();
    }
}
