public class Main {
    public static void main(String[] args) {
        A[] a = new A[10];
        for (int i = 0; i < 10; i++) {
            a[i] = new A();
            a[i].number = i;

        }
        System.out.println(a[1].number);
    }
}
class A{
   public int number;
}