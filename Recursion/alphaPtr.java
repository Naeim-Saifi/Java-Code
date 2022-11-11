package Recursion;

public class alphaPtr {

// a
// ab
// abc
// abcd
// abcde
    // public static void ptr(int a,int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.print((char)a);
    //     ptr(a+1, n-1);
        
    // }
    // public static void rec2(int a,int n){
    //     if(n>5){
    //         return;
    //     }
    //     ptr(a, n);
    //     System.out.println();
    //     rec2(a,n+1);
    // }

// ------------------Pattern 2-----------------------------

 // A
 // BC
 // CDE
 // DEFG
 // EFGHI
    public static void Ptr(int a,int n){
        if(n==0){
            return;
        }
        System.out.print((char)a);
        Ptr(a+1,n-1);
    }
    public static void Ptr2(int a,int n){
        if(n>5){
            return;
        }
        Ptr(a, n);
        System.out.println();
        Ptr2(a+1, n+1);
    }

    public static void main(String[] args) {
    //  int n=97;
    //  rec2(n,1);



    int n=65;
    Ptr2(n, 1);
    }
}
