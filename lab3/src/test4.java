import java.util.Scanner;

import static java.lang.Math.sqrt;

public class test4 {

    public static void main(String[] args) {
        System.out.println("输入两个点的坐标：a,b");
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point a = new Point(x1,y1);
        Point b = new Point(x2,y2);
        double dis = b.distance(a);
        System.out.print("两个点的距离：");
        System.out.println(dis);
    }

}
class Point{
    private double x;
    private double y;
    Point(){
        this.x=0;
        this.y=0;
    }
    Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point a){
        return sqrt((this.getX()- a.getX())*(this.getX() - a.getX())+(this.getY() - a.getY())*(this.getY() - a.getY()));
    }
}