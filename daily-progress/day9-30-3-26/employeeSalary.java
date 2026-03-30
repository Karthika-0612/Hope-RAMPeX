abstract class employee{
    String name;
    int id;
     abstract  double calculateSalary();
}
class fulltime extends employee{
    double monthlySalary;
    fulltime(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.monthlySalary=salary;

    }
    double calculateSalary(){
        return monthlySalary;
    }
  
}
class parttime extends employee{
    int hours;
    double rate;
    parttime(String name,int id,double rate,int hours){
        this.name=name;
        this.id=id;
        this.hours=hours;
        this.rate=rate;
    }
    double calculateSalary(){
        return hours*rate;
    }

}
public class employeeSalary{
    public static void main(String[] args){
        employee e1=new fulltime("sam",1,50000);
        employee e2=new parttime("jam",2,5000,10);
        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());


    }
}