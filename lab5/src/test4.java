import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computabletest computabletest = new Computabletest();
        computabletest.ToCompute(new Computable() {
            @Override
            public void compute() {
                System.out.println("计算加法输入a,b的值:");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(a+b);
            }
        });
        computabletest.ToCompute(new Computable() {
            @Override
            public void compute() {
                System.out.println("计算乘法输入a,b的值:");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println(a*b);
            }
        });
   }

}
interface Computable{
    void compute();
}
class Computabletest {
    public void ToCompute(Computable c) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("加法："+new Computable() {
//            public int compute( ) {
//               int a = scanner.nextInt();
//               int b = scanner.nextInt();
//               return a+b;
//            }
        c.compute();
    }
}
