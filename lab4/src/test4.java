public class test4 {
    public static void main(String[] args) {
         Company company = new Company();
         System.out.println("该公司一年需要支付的薪水总额:"+company.totalMoney());
    }

}
abstract class Employee{
    abstract double earnings();
}
class YearWorker extends Employee{

    @Override
    double earnings() {
        return 100000;
    }
}
class MonthWorker extends Employee{

    @Override
    double earnings() {
        return 5000*12;
    }
}
class Company{
    Employee[] employees = new Employee[11];

    Company(){
        for(int i=1;i<11;i++){
            if(i%2==0){
                employees[i] = new YearWorker();
            }
            else
                employees[i] = new MonthWorker();
        }
    }
    public double totalMoney(){
        double sum=0;
        for(int i=1;i<11;i++){
            sum+=employees[i].earnings();
        }
        return sum;
    }
}
