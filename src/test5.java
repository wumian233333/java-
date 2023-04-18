import java.io.*;

public class test5 {
    public static void main(String[] args) {
        String s = ("s.txt");
        String d = ("d.txt");
        copyFile(s,d);
    }
    public static void copyFile(String sFile,String dFile){
        try{
            BufferedReader bs = new BufferedReader(new FileReader(sFile));
            BufferedReader bd = new BufferedReader(new FileReader(dFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(dFile));
            String strLine =  null;
            while ((strLine=bs.readLine())!=null){
             bw.write(strLine);
             System.out.println(strLine);

             System.out.println(bd.readLine());
            }
            bw.close();
            bs.close();
            bd.close();
        } catch (IOException e) {
              System.out.println(e.toString());
        }
    }
}
