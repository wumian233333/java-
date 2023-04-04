public class test2 {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("输出圆的面积:\t\t"+circle.GetArea()+"\t周长:"+circle.GetPerimeter());
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println("输出矩形的面积:\t"+rectangle.GetArea()+"\t\t周长:"+rectangle.GetPerimeter());
        Triangle triangle = new Triangle(3,4,5);
        System.out.println("输出三角形的面积:\t"+triangle.GetArea()+"\t\t周长:"+triangle.GetPerimeter());

    }
}
abstract class Shape{
    abstract double GetArea();
    abstract double GetPerimeter();
}
class Circle extends Shape{
    private double r;
    Circle(int r){
        this.r=r;
    }
    Circle(){}

    public void setR(double r) {
        this.r = r;
    }
    double  GetArea(){
        return 3.14*r*r;
    }
    double GetPerimeter(){
        return 2*3.14*r;
    }
}
class Triangle extends Shape{
    double  a,b,c;
    Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double GetArea(){
        double p = GetPerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    double GetPerimeter(){
        return a+b+c;
    }
}
class Rectangle extends Shape{
    double a,b;
    Rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    double GetArea(){
        return a*b;
    }
    double GetPerimeter(){
        return  (a+b)*2;
    }
}