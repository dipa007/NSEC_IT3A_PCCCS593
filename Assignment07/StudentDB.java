import java.util.*;
class Name { String first, middle, last; }
class DOB { int day, month, year; }
class Student {
    int id; Name name=new Name(); String gender; DOB dob=new DOB();
    int eng, math, cs;
    void input(Scanner sc){
        id=sc.nextInt();
        name.first=sc.next(); name.middle=sc.next(); name.last=sc.next();
        gender=sc.next();
        dob.day=sc.nextInt(); dob.month=sc.nextInt(); dob.year=sc.nextInt();
        eng=sc.nextInt(); math=sc.nextInt(); cs=sc.nextInt();
    }
    void show(){
        System.out.printf("ID:%d Name:%s %s %s Gender:%s DOB:%02d-%02d-%04d Marks[E:%d M:%d C:%d]%n",
            id,name.first,name.middle,name.last,gender,dob.day,dob.month,dob.year,eng,math,cs);
    }
    String fullName(){ return (name.first+" "+name.middle+" "+name.last).toLowerCase(); }
}
public class StudentDB {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Student[] s=new Student[n];
        for(int i=0;i<n;i++){ s[i]=new Student(); s[i].input(sc); }
        String mode=sc.next(); // "id" or "name"
        if(mode.equalsIgnoreCase("id")){
            int q=sc.nextInt();
            for(Student st:s) if(st.id==q){ st.show(); return; }
            System.out.println("Not found");
        } else {
            sc.nextLine();
            String q=sc.nextLine().toLowerCase();
            for(Student st:s) if(st.fullName().equals(q)){ st.show(); return; }
            System.out.println("Not found");
        }
        sc.close();
    }
}
