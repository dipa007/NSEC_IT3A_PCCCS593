class MathException extends Exception { MathException(String m){ super(m); } }
class OverflowException extends MathException { OverflowException(String m){ super(m); } }
class UnderflowException extends MathException { UnderflowException(String m){ super(m); } }
public class MathExceptionDemo {
    static void check(int v) throws MathException {
        if (v > 100) throw new OverflowException("Value > 100");
        else throw new UnderflowException("Value <= 100");
    }
    public static void main(String[] args){
        try {
            throw new OverflowException("Manual overflow");
        } catch (OverflowException e){
            System.out.println("Handled overflow: " + e.getMessage());
        } catch (UnderflowException e){
            System.out.println("Handled underflow: " + e.getMessage());
        } catch (MathException e){
            System.out.println("Rethrowing from MathException: " + e.getMessage());
            throw new RuntimeException(e);
        }
        int val = 120;
        try {
            check(val);
        } catch (OverflowException e){
            System.out.println("Overflow: " + e.getMessage());
        } catch (UnderflowException e){
            System.out.println("Underflow: " + e.getMessage());
        } catch (MathException e){
            System.out.println("General MathException: " + e.getMessage());
        }
    }
}
