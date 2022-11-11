package Recursion;

public class pattern {
    public static void print1(int n){
        if(n==0){
            return;
        }
        System.out.print("*");
       print1(n-1);
    }
    public static void pat(int n,int a){
        if(n==0){
            return;
        }
        print1(a);
        System.out.println();
        pat(n-1,a+1);
    }
    public static void main(String[] args) {
        int n=5;
        pat(n,1);
    }
}
