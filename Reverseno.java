// import java.util.Scanner;
public class Reverseno {
    public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter no.");
    //     int n=sc.nextInt();
    //     sc.close();
    //     int copy=n;
    //     int count=0;
    //     int pow=1;
    //     int res=0;
    //     while(n!=0){
    //         n=n/10;
    //         count++;
    //     }
    //     while(count>1){
    //         pow=pow*10;
    //         count--;
    //     }
    //     while(copy!=0){
    //         int rem=copy%10;
    //         res+=(rem*pow);
    //         copy=copy/10;
    //         pow=pow/10;
    //     }
    //     System.out.println(res);
    int num=1234;
    int res;
    int temp=0;
    while(num!=0){
        res=num%10;
        num=num/10;
        temp=temp*10+res;
 
    }
    System.out.println(temp);
     }
}
