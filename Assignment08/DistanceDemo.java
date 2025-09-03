abstract class Distance { double dist; Distance(double d){ dist=d; } abstract void travelTime(); }
class DistMiles extends Distance { DistMiles(double d){ super(d); } void travelTime(){ System.out.printf("Time at 60 mph: %.2f hours%n", dist/60.0); } }
class DistMKS extends Distance { DistMKS(double d){ super(d); } void travelTime(){ System.out.printf("Time at 100 km/h: %.2f hours%n", dist/100.0); } }
public class DistanceDemo {
    public static void main(String[] args){
        Object a = new DistMiles(300);
        Object b = new DistMKS(500);
        ((DistMiles)a).travelTime();
        ((DistMKS)b).travelTime();
    }
}
