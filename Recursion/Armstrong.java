package Recursion;

public class Armstrong {
    public static void arm(int n,int a)
    {
        if(n==0){
            return;
        }
        arm(n/10,a+1);
        check(n, a);
        
    }
    public static void check(int n,int a)
    {
        if(n==0){
            return;
        }
        int rem=n%10;
        int res=0;
        res+=Math.pow(rem,a);
        System.out.println(res);
        check(n/10, a);
        
    }

    public static void main(String[] args) {
        int n=153;
        // int cpy=n;
        int a=0;
        arm(n, a);
    }
}
