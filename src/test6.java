import java.io.*;

public class test6 {
    public static void main(String[] args) {
        try{
            FileReader source = new FileReader("s.txt");
            FileReader target = new FileReader("d.txt");
            FileWriter targetWrite = new FileWriter("d.txt");
            BufferedReader bs = new BufferedReader(source);
            BufferedReader bt = new BufferedReader(target);
            BufferedWriter btw = new BufferedWriter(targetWrite);
            String strLine = null;
            int i=1;
            while ((strLine=bs.readLine())!=null){
                strLine = "第"+i+"行："+strLine;
                btw.write(strLine);
                btw.newLine();
                System.out.println(strLine);
                i++;
            }
            btw.close();
        } catch (IOException e) {
             System.out.println(e.toString());
        }
    }
}
