package mypkg;
public class AddDouble implements addmul {
    double a,b,s;
    public AddDouble(double a,double b){ this.a=a; this.b=b; }
    public void add(){ s=a+b; }
    public void show(){ System.out.println("Sum(double): "+s); }
}
