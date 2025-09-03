public class TwoThreads {
    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            for(int i=1;i<=10;i++) System.out.print(i + (i<10?" ":""));
        });
        Thread t2 = new Thread(() -> {
            for(int i=10;i>=1;i--){
                if(i==6){
                    try { Thread.sleep(10000); } catch (InterruptedException e){}
                }
                System.out.print(i + (i>1?" ":""));
            }
        });
        t1.start(); t2.start();
        try { t1.join(); t2.join(); } catch (InterruptedException e){}
    }
}
