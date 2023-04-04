public class test2 {
    public static void main(String[] args) {
        haitun.xunlian a = new haitun("花花",10).new  xunlian();
        a.dance();
        a.cry();
    }
}
class haitun{
    String name;
    int age;
    haitun(String name,int age){
        this.name=name;
        this.age = age;
    }
    haitun(){}
    class xunlian{
        public void dance(){
            System.out.println("我的名字是："+name);
            System.out.println("我在高兴地跳舞");
        }
        public void cry(){
            System.out.println("我的年龄是："+age);
            System.out.println("呼~呼~呼~");
        }
    }
}