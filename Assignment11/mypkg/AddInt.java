package mypkg;
public class AddInt implements addmul {
    int a,b,s;
    public AddInt(int a,int b){ this.a=a; this.b=b; }
    public void add(){ s=a+b; }
    public void show(){ System.out.println("Sum(int): "+s); }
}
