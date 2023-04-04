import java.util.Scanner;

public class test1
{
    public static void main(String[] args){

    System.out.println("请输入a,b,c三个参数的值：");
    Scanner reader = new Scanner(System.in);
    double a = reader.nextDouble();
    double b = reader.nextDouble();
    double c = reader.nextDouble();
    double dealt=0,x=0;
    dealt = b*b-4*a*c;
    if(dealt<0){
        System.out.println("该方程无解");
    }
    else if(dealt==0){
        System.out.println("有一个实根");
        x = (-b+Math.sqrt(dealt))/(2*a);
        System.out.println("x = "+x);
    }
    else {
        System.out.println("有两个实根");
        double x1,x2;
        x1 = (-b+Math.sqrt(dealt))/(2*a);
        x2 = (-b-Math.sqrt(dealt))/(2*a);
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }

}
}
