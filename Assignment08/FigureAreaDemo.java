abstract class TwoDFigure { double dim1, dim2; TwoDFigure(double a,double b){ dim1=a; dim2=b; } abstract double calculateArea(); }
class Rectangle extends TwoDFigure { Rectangle(double l,double b){ super(l,b); } double calculateArea(){ return dim1*dim2; } }
class Triangle extends TwoDFigure { Triangle(double b,double h){ super(b,h); } double calculateArea(){ return 0.5*dim1*dim2; } }
public class FigureAreaDemo {
    public static void main(String[] args){
        Object r = new Rectangle(5,4);
        Object t = new Triangle(6,3);
        System.out.println("Rectangle area: "+((Rectangle)r).calculateArea());
        System.out.println("Triangle area: "+((Triangle)t).calculateArea());
    }
}
