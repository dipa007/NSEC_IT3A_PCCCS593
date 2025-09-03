class Employee {
    int EID; String name, city; double basic;
    Employee(int id, String name, String city, double basic){ this.EID=id; this.name=name; this.city=city; this.basic=basic; }
    double salary(){ // base structure
        double agp = 0.5*basic;
        double merged = basic + agp;
        return merged + 0.5*merged + 0.15*merged;
    }
    void show(){
        System.out.printf("EID:%d Name:%s City:%s Gross:%.2f%n", EID,name,city,salary());
    }
}
class Company1 extends Employee {
    Company1(int id, String name, String city, double basic){ super(id,name,city,basic); }
    @Override double salary(){
        double agp = 0.4*basic;
        double merged = basic + agp;
        return merged + 0.25*merged + 0.10*merged;
    }
}
class Company2 extends Employee {
    Company2(int id, String name, String city, double basic){ super(id,name,city,basic); }
    @Override double salary(){
        double agp = 0.5*basic;
        double merged = basic + agp;
        return merged + 0.5*merged + 0.15*merged;
    }
}
public class EmployeeDemo {
    public static void main(String[] args){
        Employee e = new Employee(1,"Base","Kolkata",10000);
        Company1 c1 = new Company1(2,"Alice","Kolkata",10000);
        Company2 c2 = new Company2(3,"Bob","Kolkata",10000);
        e.show(); c1.show(); c2.show();
        System.out.println(c1.salary() > c2.salary() ? "Company1 higher" : "Company2 higher or equal");
    }
}
