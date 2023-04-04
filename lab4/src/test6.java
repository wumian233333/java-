public class test6 {
    public static void main(String[] args) {
        Complex x = new Complex(3,2);
        Complex y = new Complex(2,3);
        Complex c =new Complex();
        System.out.print("x:");
        x.show();
        System.out.print("y:");
        y.show();
        System.out.print("c:");
        c.show();
        System.out.print("加法:");
        c = c.add(x,y);
        c.show();
        System.out.print("减法:");
        c = c.sub(x,y);
        c.show();
        System.out.print("乘法:");
        c = c.mul(x,y);
        c.show();
        System.out.print("是否相等:"+x.IsEqual(y));
    }

}
class Complex{
    private int a;//实部
     private int b;//虚部

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public void show(){
        if(this.getB()>0)
            System.out.println(getA()+"+"+getB()+"i");
        else if(this.getB()==0)
            System.out.println(this.getA());
        else
            System.out.println(  getA()+""+getB()+"i");
    }
    Complex(int a,int b){
        this.a=a;
        this.b=b;
    }
    Complex(){
        a=0;
        b=0;
    }
    public Complex  add(Complex x,Complex y){
        Complex c = new Complex();
        c.a = x.getA()+y.getA();
        c.b = x.getB()+y.getB();
        return c;
    }
    public Complex sub(Complex x,Complex y){
        Complex c =new Complex();
        c.a = x.getA()-y.getA();
        c.b = x.getB()-y.getB();
        return c;
    }
    public Complex mul(Complex x,Complex y){
        Complex c = new Complex();
        c.a = x.getA()*y.getA()-x.getB()*y.getB();
        c.b = x.getA()*y.getB()+x.getB()*y.getA();
        return c;
    }
    public boolean IsEqual(Complex x){
        return x.getA() == this.getA() && x.getB() == this.getB();
    }
}
