import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int x,y,z;
        try{
            x = Integer.parseInt(a);
            y = Integer.parseInt(b);
            z = x/y;
            System.out.println(z);
        } catch (NumberFormatException e) {
            System.out.println("数字格式异常");
            throw new RuntimeException(e);
        }
        catch(ArithmeticException e){
            System.out.println("算数异常(除数为零)");
        }
    }
}
