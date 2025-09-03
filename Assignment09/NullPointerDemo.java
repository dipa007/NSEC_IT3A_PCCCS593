public class NullPointerDemo {
    public static void main(String[] args){
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException ex){
            System.out.println("Handled: " + ex);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
