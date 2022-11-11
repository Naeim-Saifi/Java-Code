package Recursion;

public class PtrnNo {
    public static void print(int n,int a){
        if(n==0){return;}
        System.out.print(a);  
        print(n-1,a+1);      
    }
    public static void print2(int n,int a){
        if(n==0){
            return;
        }
        print(a,a);
        System.out.println();
        print2(n-1,a+1);
    }
    public static void main(String[] args) {
        int n=5;
        print2(n,1);
        
    }
}
