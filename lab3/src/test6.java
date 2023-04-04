import static java.lang.Math.sqrt;

public class test6 {
    public static void main(String[] args) {
        Circle2D a = new Circle2D(0,0,2);
        Circle2D b =new Circle2D(0,0,1);
        System.out.println("a的面积："+a.getArea());
        System.out.println("b的面积："+b.getArea());
        System.out.println("a的周长："+a.getPerimeter());
        System.out.println("b的周长："+b.getPerimeter());
        System.out.println("a是否在b内："+a.contains(b));
        System.out.println("a是否与b重合："+a.overlaps(b));


    }
}
class Circle2D{
    int x,y;
    int r;
    Circle2D(){
        x=0;
        y=0;
        r=1;
    }
    Circle2D(int x,int y,int r){
        this.r=r;
        this.y=y;
        this.x=x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getArea(){
        return 3.14*r*r;
    }
    public double getPerimeter(){
        return 2*r*3.14;
    }
    public boolean contains(Circle2D circle) {

        double distance = sqrt((this.getX() - circle.getX()) * (this.getX() - circle.getX()) + (this.getY() - circle.getY()) * (this.getY() - circle.getY()));
        return distance + circle.r <= this.r;
    }
    public boolean overlaps(Circle2D circle) {
        double distance = sqrt((this.getX() - circle.getX()) * (this.getX() - circle.getX()) + (this.getY() - circle.getY()) * (this.getY() - circle.getY()));
        return distance == 0 && this.r == circle.r;
    }
}
