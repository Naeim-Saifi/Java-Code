package Recursion;
public class Sumno{
    public static int sum(int n){
        
      if(n==0){
        return n;
      }
     return n+sum(n-1);
     
    }
    public static void main(String[] args) {
        int n=10;
        int res=sum(n);
        System.out.println(res);
    }
}