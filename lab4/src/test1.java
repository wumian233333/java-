public class test1 {
    public static void main(String[] args) {
        Person person = new Person("李四",40,'男');
        Student student = new Student(10001,"张三",18, '男');
        person.show();
        student.show();
    }
}
class Person{
    private String name;
    private int age;
    private char gender;
    Person(String name,int age,char gender){
        this.age=age;
        this.name=name;
        this.gender=gender;
    }
    Person(){}
    public void show(){
        System.out.println("Person信息如下：");
        System.out.println("姓名："+this.name+"\t性别："+this.gender+"\t年龄："+this.age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
}
class Student extends Person{
    private int id;
    Student(int id,String name,int age,char gender){
        super(name, age, gender);
        this.id=id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void show() {
        System.out.println("Student个人信息如下：");
        System.out.println("姓名："+getName()+"\t性别："+getGender()+"\t年龄："+getAge()+"\t学号："+getId());
    }
}