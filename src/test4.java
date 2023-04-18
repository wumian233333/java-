import java.io.File;
import java.io.IOException;

public class test4 {
    public static void main(String[] args) {
        File file = new File("学号.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("创建成功！");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(file.getName()+"是否可读："+file.canRead());
        System.out.println(file.getName()+"的长度："+file.length());
        System.out.println(file.getName()+"的绝对路径："+file.getAbsolutePath());
    }

}

