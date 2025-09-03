abstract class NumberBase { int value; NumberBase(int v){ value=v; } abstract void displayNum(); }
class HexNum extends NumberBase { HexNum(int v){ super(v); } void displayNum(){ System.out.println(Integer.toHexString(value).toUpperCase()); } }
class OctalNum extends NumberBase { OctalNum(int v){ super(v); } void displayNum(){ System.out.println(Integer.toOctalString(value)); } }
public class NumberDemo {
    public static void main(String[] args){
        Object h = new HexNum(255);
        Object o = new OctalNum(255);
        ((HexNum)h).displayNum();
        ((OctalNum)o).displayNum();
    }
}
