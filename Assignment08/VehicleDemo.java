class Vehicle { int wheels; double speed; Vehicle(int w,double s){ wheels=w; speed=s; } }
class Car extends Vehicle { int passengers; Car(double s,int p){ super(4,s); passengers=p; } }
class Truck extends Vehicle { double loadLimit; Truck(double s,double l){ super(6,s); loadLimit=l; } }
public class VehicleDemo {
    public static void main(String[] args){
        Car car = new Car(120,5);
        Truck truck = new Truck(90,5000);
        System.out.printf("Car: wheels=%d speed=%.1f passengers=%d%n", car.wheels,car.speed,car.passengers);
        System.out.printf("Truck: wheels=%d speed=%.1f loadLimit=%.1f%n", truck.wheels,truck.speed,truck.loadLimit);
        System.out.println(car.speed>truck.speed ? "faster" : (car.speed<truck.speed ? "slower" : "equal"));
    }
}
