package Recursion;

public class primeNo {
    public static boolean check(int n, int cpy) {
        if (cpy==1) {
            return true;
        }
        if(n%cpy==0){
           return false;
        }
       return check(n, cpy-1 );
    }

    public static void main(String[] args) {

       boolean temp= check(11,10);
       if(temp){
        System.out.println("Prime");
       }
       else{
        System.out.println("Not Prime");
       }
    }
}
