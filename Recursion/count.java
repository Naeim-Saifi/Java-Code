package Recursion;

public class count {
    public static int zerCount(int n,int b){
        if(n==0){
            return b;
        }
    
        if(n%10==0){
            b++;
        }
      return zerCount(n/10,b);
       }
    
    public static void main(String[] args) {
        int n=10040;
        int b=0;
        int res;
        res=zerCount(n,b);
        System.out.println(res);
    }
}
