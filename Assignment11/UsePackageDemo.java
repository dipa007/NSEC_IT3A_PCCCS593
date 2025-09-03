import mypkg.*;
public class UsePackageDemo {
    static void outsideMethod(){ System.out.println("Outside method in default package."); }
    public static void main(String[] args){
        addmul x1 = new AddInt(3,4); x1.add(); x1.show();
        addmul x2 = new AddDouble(2.5, 7.5); x2.add(); x2.show();
        addmul x3 = new AddString("Hello, ", "World"); x3.add(); x3.show();
        outsideMethod();
    }
}
