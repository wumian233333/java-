import java.util.StringTokenizer;

public class test3 {
    public static void main(String[] args) {
         String a = "数学87分,物理76分,英语96分";
         String regex = "[^0123456789.]+";
         a = a.replaceAll(regex,"#");
        StringTokenizer fenxi = new StringTokenizer(a,"#");
        double sum=0;
        int amount = fenxi.countTokens();
        while (fenxi.hasMoreTokens()){
            String item = fenxi.nextToken();
            double fenshu = Double.parseDouble(item);
            sum+=fenshu;
        }
        System.out.println("总分数："+sum);

        System.out.println("平均分："+sum/amount);
    }

}
