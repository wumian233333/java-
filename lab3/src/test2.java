import java.util.Scanner;

import static java.lang.System.exit;

public class test2 {
    public static void main(String[] args){

        Account a =new Account();
        Scanner sc =new Scanner(System.in);


        while (true){
            System.out.println("--------------------------------");
            System.out.println("1.开户");
            System.out.println("2.存钱");
            System.out.println("3.取钱");
            System.out.println("4.显示信息");
            System.out.println("0.退出");
            System.out.println("--------------------------------");

            System.out.println("输入你的选择：");
            int p = sc.nextInt();
            switch (p){
                case 1:
                    a.creat();
                    break;
                case 2:
                    a.save();
                    break;
                case 3:
                    a.get();
                    break;
                case 4:
                    a.showall();
                    break;
                case 0:
                    exit(0);
            }
        }
    }
}
class Account {
    static int MAX = 10100;//最大用户容量
    static int i = 10001;

    private Custumer[] custumers = new Custumer[10100];//所属客户
    Scanner sc = new Scanner(System.in);
    public void creat() {

        if (i >= MAX)
            System.out.println("用户已经达到上限，禁止开户");
        else {
            custumers[i] = new Custumer();
            custumers[i].ID =  i;
            System.out.println("姓名：");
            String m = sc.next();
            custumers[i].setName(m);
            System.out.println("电话：");
            String  tel = sc.next();
            custumers[i].setTel(tel);
            System.out.println("密码：");
            int password = sc.nextInt();
            custumers[i].setPassword(password);
            custumers[i].setBalance(0);
            i++;
        }
    }
    public void save(){
        System.out.println("输入你的银行卡号：");
        int i = sc.nextInt();
        if(i<=custumers.length+10001)
            custumers[i].saveMoney();
        else {
            System.out.println("所输入的用户不存在，请重新输入");
            return;
        }
    }
    public void get(){
        System.out.println("请输入你的银行卡号：");
        int i = sc.nextInt();
        if(i<=custumers.length+10001)
            custumers[i].GetMoney();
        else {
            System.out.println("所输入的用户不存在，请重新输入");
            return;
        }
    }
    public void showall(){
        System.out.println("请输入你的银行卡号：");
        int id = sc.nextInt();
        System.out.println("请输入你的密码：");
        int passward2 = sc.nextInt();
        if(passward2!=custumers[id].GetPassword()){
            System.out.println("密码输入错误，请重新输入：");
        }
        else {
            System.out.println("--------------------------------");
            System.out.println("银行卡号："+custumers[id].GetID());
            System.out.println("姓名："+custumers[id].GetName());
            System.out.println("电话号码："+custumers[id].GetTel());
            System.out.println("余额："+custumers[id].GetBalance());
            System.out.println("--------------------------------");
        }

    }
}
class  Custumer{
    private String name;
    private String tel;
    public int ID;//账户
    private double balance;//余额
    private int password;
    public Custumer(){

    }
    public Custumer(String name,String  tel,int ID){
        this.ID=ID;
        this.tel=tel;
        this.name=name;
    }
    public void setName(String m){
        name = m;
    }
    public void setTel(String  t){
        tel = t;
    }
    public void setPassword(int p){
        password=p;
    }
    public void setBalance(double b){
        balance=b;
    }
    public double GetBalance(){
        return this.balance;
    }
    public int GetID(){
        return this.ID;
    }
    public int GetPassword(){
        return this.password;
    }
    public String GetName()
    {
        return this.name;
    }
    public String GetTel(){
        return this.tel;
    }
    //存钱
    public void saveMoney(){
        System.out.println("请输入您存的钱：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        setBalance(GetBalance()+money);
        System.out.println(GetID()+"存入:"+money);
        System.out.println("现有余额:"+GetBalance());
    }
    //取钱
    public void GetMoney( ){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的密码：");
        int password1 = sc.nextInt();
        System.out.println("请输入你的取钱数额：");
        double money = sc.nextDouble();
        if(GetPassword()!=password1){
            System.out.println("您输入的密码错误请重新输入");
        }
        else {
            if(money>GetBalance()){
                System.out.println("余额不足");
            }
            else {
                setBalance(GetBalance()-money);
                System.out.println("取钱后："+GetBalance());
            }
        }
    }
}
