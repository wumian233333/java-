
public class test7 {
    public static void main(String[] args) {
        calculate c = new calculate();
        for(int i=0;i<5;i++){
            c.students[i].showall();
        }
        System.out.println("这五个学生的java平均值："+c.javaAverage());
        System.out.println("java成绩的最大值最小值：");
        c.showMaxMin();
    }
}
class calculate{
    Student[] students=new Student[5];
    calculate(){
        students[0] = new Student(1,"a","男",16,80,90,60,75,50);
        students[1] = new Student(2,"b","女",15,60,80,70,88,80);
        students[2] = new Student(3,"c","男",17,90,80,58,79,89);
        students[3] = new Student(4,"d","男",18,90,58,64,76,84);
        students[4] = new Student(5,"e","男",19,65,78,75,67,50);
    }
    public double javaAverage(){
        return (students[0].getJava()+students[1].getJava()+students[2].getJava()+students[3].getJava()+students[4].getJava())/5;
    }
    public void showMaxMin(){
        double Max,Min;
        int a = 0,b=0;//a表示max的位置，b表示min的位置
        Max=0;

        Min = students[0].getJava();
        for(int i=0;i<5;i++){
            if(students[i].getJava()>Max){
                Max=students[i].getJava();
                a=i;
            }
            if(students[i].getJava()<Min){
                Min=students[i].getJava();
                b=i;
            }
        }
        System.out.println("最大值："+students[a].getName()+" "+Max);
        System.out.println("最小值："+students[b].getName()+" "+Min);
    }
}
class Student{
    private int ID;
    private String name;
    private String sex;
    private int age;
    private double math,chinese,english,physics,java;
    Student(int ID,String name,String sex,int age,double math,double chinese,double english,double java,double physics){
        this.age=age;
        this.ID=ID;
        this.name=name;
        this.sex=sex;
        this.math=math;
        this.english=english;
        this.chinese=chinese;
        this.java=java;
        this.physics=physics;
    }
    Student(){}
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
    public double getJava() {
        return java;
    }
    public void showall(){
        System.out.println("输出所有信息：");
        System.out.println("学号："+this.getID());
        System.out.println("姓名："+this.getName());
        System.out.println("性别："+this.getSex());
        System.out.println("年龄："+this.getAge());
        System.out.println("math\tchinese\tenglish\tphysics\tjava");
        System.out.println(this.math+"\t"+this.chinese+"\t"+this.english+"\t"+this.physics+"\t"+this.java);
    }
}