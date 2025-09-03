public class DivideByZeroTryCatch {
    public static void main(String[] args){
        try {
            int a = 10/0;
            System.out.println(a);
        } catch (ArithmeticException ex){
            System.out.println("Caught: " + ex);
        }
    }
}
