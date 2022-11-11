package Recursion;
public class Pyramid {
    public static void rec1(int n){
        if(n==0){
            return;
        }
        System.out.print(" ");
        rec1(n-1);
    }
    public static void rec2(int n){
        if(n==0){
            return;
        }
        System.out.print("* ");
        rec2(n-1);
    }
    public static void rec3(int n,int a){
        if(n==0){
            return;
        }
        rec1(n-1);
        rec2(a);
        System.out.println();
        rec3(n-1, a+1);
    }

    public static void main(String[] args) {
        int n=5;
        rec3(n, 1);
        
    }
}
