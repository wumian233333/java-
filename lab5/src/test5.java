public class test5 {
    public static void main(String[] args) throws goodsException {

        try {
            Goods goods1 = new Goods();
            goods1.setIsDanger(false);
            goods1.setName("苹果");
            Goods goods2 = new Goods();
            goods2.setName("炸药");
            goods2.setIsDanger(true);
            Tool tool = new Tool();
            System.out.println("判断第一个物品：");
            tool.checkGoods(goods1);
            System.out.println("判断第二个物品：");
            tool.checkGoods(goods2);
        } catch (goodsException e) {
                e.toPrint();
                throw new goodsException();

        }
    }

}
class goodsException extends Throwable {
    private String message;
    goodsException(){
         message = "该物品为违禁品";
    }
    public void toPrint(){
        System.out.println(message);
    }
}
class Tool{
    public void checkGoods(Goods g) throws goodsException {
        if(g.IsDanger()){
            throw new goodsException();//抛出方法异常
        }
        System.out.println("name:"+g.getName());
        System.out.println("是否为违禁物:"+g.IsDanger());
    }
}
class Goods{
    private boolean danger = false;
   private String name;
     public void setIsDanger(boolean b){
         this.danger = b;
    }
    public boolean IsDanger(){
        return danger;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}