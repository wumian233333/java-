public class test3 {
    public static void main(String[] args) {
        gouwuche g1 = new gouwuche();
        g1.add(new clothes("羽绒服",66.9));
        g1.add(new drink("可乐",3.0));
        g1.add(new food("口水鸡",13));
        System.out.println("您购买的数量是："+g1.getNumber());
        g1.GetMoney();
    }
}
abstract class Goods{
    abstract public String getName();
    abstract public double getPrice();
}
class clothes extends Goods{//衣服
    private String name;
    private double price;

    clothes(String name,double price) {
        this.name = name;
        this.price=price;
    }
    public String getName(){
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
class drink extends Goods{
    private String name;
    private double price;

    drink(String name,double price) {
        this.name = name;
        this.price=price;
    }
    public String getName(){
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
class food extends Goods{
    private String name;
    private double price;

    food(String name,double price) {
        this.name = name;
        this.price=price;
    }
    public String getName(){
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
class gouwuche{
    Goods [] goods;
    private int number;//物品数量
    public static int max=10;//最大的购物数量
    gouwuche( ){
        this.goods=new Goods[max];
    }
    public void add(Goods goods){
        if(this.goods.length>max){
            System.out.println("所拿物品数量已达到最大，装不下辣！");
        }
        else {
            this.goods[number] = goods;
            number++;
        }
    }
    public void GetMoney(){
        double sum=0;
        System.out.println("以下是您的详细购买信息：");
        for(int i=0;i<this.number;i++){

            sum+=this.goods[i].getPrice();
            System.out.println("name:"+this.goods[i].getName()+"\t\tprice:"+this.goods[i].getPrice());
        }
        System.out.println("总金额："+sum);
    }
    public int getNumber(){
        return this.number;
    }
}