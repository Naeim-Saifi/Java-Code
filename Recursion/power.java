package Recursion;
// import java.util.*;
public class power {
public static int pow(int a,int b){
    int res;
   if(b>0){
    res=a*pow(a, b-1);
    return res;
   }
   else{
    return 1;
   }

}
    public static void main(String[] args) {
        int a=3,b=2;
        int res;
        res=pow(a, b);
        System.out.println(res);
    }
}
