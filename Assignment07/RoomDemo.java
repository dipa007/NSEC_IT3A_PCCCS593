public class RoomDemo {
    public static void main(String[] args){
        Room r1=new Room(10,12,8);
        Room r2=new Room(6.5,7.2,5.0);
        System.out.println("Volume1="+r1.volume());
        System.out.println("Volume2="+r2.volume());
    }
}
