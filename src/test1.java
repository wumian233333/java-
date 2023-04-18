public class test1 {
    public static void main(String[] args) {

        string1 a = new string1("123456");
        System.out.println(a.charAt(5));
        System.out.println(a.reverse());

    }

}
class string1{
    private String  a;
    string1(String a){
        this.a=a;
    }
    public char charAt(int index){
        char[] a1 = a.toCharArray();
        index--;
         return a1[index];
    }
    public String reverse(){
        String b = "";
        char[] a1 = a.toCharArray();
        for(int j=a.length()-1;j>=0;j--){
            b = b + a1[j];
        }
        return b;
    }
}