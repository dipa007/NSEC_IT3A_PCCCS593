public class AddIncreaseThreads {
    static class Holder {
        int a, b;
        Holder(int a, int b){ this.a=a; this.b=b; }
        synchronized void add(){
            int c=a, d=b;
            try { Thread.sleep(500); } catch (InterruptedException e){}
            System.out.println("Sum: " + (c+d));
        }
        synchronized void increase(){
            a+=5; b+=5;
            try { Thread.sleep(500); } catch (InterruptedException e){}
            System.out.println("Increased: a=" + a + " b=" + b);
        }
    }
    public static void main(String[] args) throws Exception {
        Holder h = new Holder(10,20);
        Thread tAdd = new Thread(h::add);
        Thread tInc = new Thread(h::increase);
        tAdd.start(); tAdd.join();
        tInc.start(); tInc.join();
    }
}
