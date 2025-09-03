package mypkg;
public class AddString implements addmul {
    String a,b,s;
    public AddString(String a,String b){ this.a=a; this.b=b; }
    public void add(){ s=a+b; }
    public void show(){ System.out.println("Concat(String): "+s); }
}
