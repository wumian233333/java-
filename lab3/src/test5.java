public class test5 {
    public static void main(String[] args) {
        student1 stu = new student1();
        Circle c =new Circle(2);
        sanjiao s = new sanjiao(3,4,5);
        juxin j = new juxin(2,3);
        stu.area(c);
        stu.area(s);
        stu.area(j);
        stu.peirmeter(c);
        stu.peirmeter(s);
        stu.peirmeter(j);
    }
}
class student1{
    public void area(Circle c){
        System.out.println("计算出圆的面积："+c.getArea());
    }
    public void peirmeter(Circle c){
        System.out.println("计算出圆的周长："+c.getperimeter());
    }
    public void area(sanjiao c){
        System.out.println("计算出三角形的面积："+c.getArea());
    }
    public void peirmeter(sanjiao c){
        System.out.println("计算出三角形的周长："+c.getperimeter());
    }
    public void area(juxin c){
        System.out.println("计算出矩形的面积："+c.getArea());
    }
    public void peirmeter(juxin c){
        System.out.println("计算出矩形的周长："+c.getperimeter());
    }
}
class Circle{
    private double r;
    Circle(int r){
        this.r=r;
    }
    Circle(){}

    public void setR(double r) {
        this.r = r;
    }
    double getArea(){
        return 3.14*r*r;
    }
    double getperimeter(){
        return 2*3.14*r;
    }
}
class sanjiao{
    double  a,b,c;
    sanjiao(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double getArea(){
         double p = getperimeter()/2;
         return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    double getperimeter(){
        return a+b+c;
    }
}
class juxin{
    double a,b;
    juxin(double a,double b){
        this.a=a;
        this.b=b;
    }
    double getArea(){
        return a*b;
    }
    double getperimeter(){
        return  (a+b)*2;
    }
}