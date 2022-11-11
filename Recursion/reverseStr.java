package Recursion;

public class reverseStr {
    public static String revrese(String str){
        if(str.length()==1){
            return str;
        }
        return revrese(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        String str="Hello";
        String Res=revrese(str);
        System.out.println(Res);
    }
}
