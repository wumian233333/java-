public class test3 {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();
        bike.start();
        bike.stop();
        bus.start();
        bus.stop();
    }
}
interface Vehicle{
    void start();
    void stop();
}
class Bike implements Vehicle{

    @Override
    public void start() {
        System.out.println("自行车开始启动了");
    }

    @Override
    public void stop() {
        System.out.println("自行车停止了");
    }
}
class Bus implements Vehicle{

    @Override
    public void start() {
        System.out.println("公共汽车开始启动了");
    }

    @Override
    public void stop() {
        System.out.println("公共汽车开始启动了");
    }
}