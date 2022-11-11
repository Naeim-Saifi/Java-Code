import java.util.Scanner;
public class Luckyno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        sc.close();
        int cpy = n;
        int count = 0;
        int pow = 1;
        int temp;
        int sum = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        while (count > 1) {
            pow *= 10;
            count--;
        }
        cpy = cpy % pow;
        pow = pow / 10;
        while (cpy != 0) {
            if (pow > 1) {
                temp = cpy / pow;
                cpy = cpy % pow;
                pow = pow / 10;
                cpy = cpy % pow;
                pow = pow / 10;
                sum = sum + temp;
            }

            else {

                sum = sum + cpy;
                break;
            }
        }
        if(sum%9==0){
            System.out.println("Given number is Lucky");
        }
        else{
            System.out.println("Given number is not Lucky");
        }
    }
}
