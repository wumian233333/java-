public class test3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Simulator simulator = new Simulator();
        simulator.playSound(dog);
        simulator.playSound(cat);
    }
}
abstract class Animal{
    abstract void cry();
    abstract String getAnimalName();

}
class Simulator{
    public void playSound(Animal animal){
        System.out.println("name："+animal.getAnimalName());
        animal.cry();
    }
}
class Dog extends Animal{
    public void cry() {
        System.out.println("汪汪汪~~~~");
    }

    public String getAnimalName() {
        return "Dog";
    }
}
class Cat extends Animal{

    @Override
    void cry() {
        System.out.println("喵喵喵~~~~");
    }

    @Override
    String getAnimalName() {
        return  "Cat";
    }
}