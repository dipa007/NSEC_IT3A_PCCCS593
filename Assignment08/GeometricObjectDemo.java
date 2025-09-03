abstract class GeometricObject {
    String color; double weight;
    GeometricObject(){ color="White"; weight=1.0; }
    String getColor(){ return color; }
    double getWeight(){ return weight; }
    abstract double findArea();
    abstract double findCircumference();
}
class TriangleGeo extends GeometricObject {
    double a,b,c;
    TriangleGeo(double a,double b,double c){ super(); this.a=a; this.b=b; this.c=c; }
    double findCircumference(){ return a+b+c; }
    double findArea(){
        double s=(a+b+c)/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
public class GeometricObjectDemo {
    public static void main(String[] args){
        TriangleGeo t = new TriangleGeo(3,4,5);
        System.out.println("Color: "+t.getColor()+", Weight: "+t.getWeight());
        System.out.printf("Area: %.2f, Circumference: %.2f%n", t.findArea(), t.findCircumference());
    }
}
