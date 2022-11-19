package Recursion;

public class Pattern3 {
    static void space(int n){
        if(n==0){
            return;
        }
        System.out.print(" ");
        space(n-1);
    }
    static void print1(int n,int i){
        if(i==0){
            return;
        }
        System.out.print(i);
        print1(n+1,i-1);
    }
    static void print2(int n,int i){
        if(n==0){
            return;
        }
        space(n-1);
        print1(1,i);
        System.out.println();
        print2(n-1,i+1);
    }
    public static void main(String[] args) {
        print2(5,1);
        
    }
}
