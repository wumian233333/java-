public class test2 {
    public static void main(String[] args) {
        String a = "zbc123you";
        System.out.println(delete(a));
    }
    public static String  delete(String a){
        String b = "";
        char[] a1 = a.toCharArray();
        for(int i=0;i<a.length();i++){
            if(a1[i]>='1'&&a1[i]<='9'){
                b+=a1[i];
            }
        }
         return b;
    }
}

