public class ArrayIndexDemo {
    static void trigger() throws Exception {
        int[] a = new int[10];
        a[15] = 7; // will throw
    }
    public static void main(String[] args){
        try {
            trigger();
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Origin: " + ex);
        } catch (Exception ex){
            System.out.println("Rethrowing...");
            throw new RuntimeException(ex);
        }
    }
}
