public class Nprime {
    public static void check(int n,int a)
    {
        if(a==0){
            return;
        }
        if(n%a!=0){
            System.out.println("Prime : "+a);
        }
        
        check(n,a-1);
    }
    // public static void check2(int n,int a)
    // {
    //     if(n==a){
    //         return;
    //     }
    //     check(n, a);
    // }
    public static void main(String[] args) {
        check(11, 10);
        
    }
}
