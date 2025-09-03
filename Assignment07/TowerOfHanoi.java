import java.util.*;
public class TowerOfHanoi {
    static void toh(int n,char from,char aux,char to){
        if(n==0) return;
        toh(n-1,from,to,aux);
        System.out.println("Move disk "+n+" from "+from+" to "+to);
        toh(n-1,aux,from,to);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        toh(n,'A','B','C');
        sc.close();
    }
}
