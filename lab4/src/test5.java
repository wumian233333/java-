import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        System.out.println("本科生：");
        Student_5 undergraduate = new Undergraduate();
        undergraduate.IsPass();

        System.out.println("研究生：");
        Student_5 graduate = new Graduate();
        graduate.IsPass();
    }
}
abstract class Student_5{
    double math;
    double java;
    double english;
    abstract void IsPass();
    double GetAverage() {
        return (math+java+english)/3;
    }
    Student_5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请按顺序输入你的各科成绩：(math,java,english)");
        math = sc.nextDouble();
        java = sc.nextDouble();
        english = sc.nextDouble();
    }
}
class Undergraduate extends Student_5{


    Undergraduate(){
        super();
    }
    public void IsPass(){
        System.out.println("平均成绩："+GetAverage());
        if(GetAverage()>=60){
            System.out.println("恭喜你本科生，可以拿到学位证");
        }
        else {
            System.out.println("很遗憾本科生，不能拿到学位证");
        }
    }
}
class Graduate extends Student_5{
    Graduate(){
        super();
    }
   public void IsPass(){
       System.out.println("平均成绩："+GetAverage());
        if(GetAverage()>=80){
            System.out.println("恭喜你研究生，可以拿到学位证");
        }
        else {
            System.out.println("很遗憾研究生，不能拿到学位证");
        }
    }
}