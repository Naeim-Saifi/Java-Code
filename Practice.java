public class Practice {
    public static void main(String[] args) {
        // int i,j,k;

        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        // for(i=1;i<=5;i++){
        // for(j=1;j<=5-i;j++){
        // System.out.print(" ");
        // }
        // for(k=1;k<=i;k++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for(i=4;i>0;i--){
        // for(j=5-i;j>0;j--){
        // System.out.print(" ");
        // }
        // for(k=i;k>0;k--){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // *
        // ***
        // *****
        // *******
        // *****
        // ***
        // *

        // for(i=1;i<=4;i++){
        // for(j=1;j<=4-i;j++){
        // System.out.print(" ");
        // }
        // for(k=1;k<=(2*i)-1;k++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for(i=3;i>0;i--){
        // for(j=4-i;j>0;j--){
        // System.out.print(" ");
        // }
        // for(k=(2*i)-1;k>0;k--){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // Find HCF of two number

        // int num1 = 18;
        // int num2 = 48;
        // int rem;
        // while(num2%num1!=0){
        // rem=num2%num1;
        // num2=num1;
        // num1=rem;
        // }
        // System.out.println(num1);

        // Other Method
        // while(num1-num2!=0){
        // if(num1>num2){
        // num1=num1-num2;
        // }
        // else{
        // num2=num2-num1;
        // }
        // }
        // System.out.println(num1);

        // Find Second Max Elements :

        // int arr[] = { 2, 4, 6, 7, 4, 9, 8 };
        // int i, max = 0;
        // int max2 = 0;
        // for (i = 0; i < arr.length; i++) {
        // if (max < arr[i]) {
        // max = arr[i];
        // }
        // }
        // for (i = 0; i < arr.length; i++) {
        // if(max!=arr[i]){
        // if(max2<arr[i]){
        // max2=arr[i];
        // }
        // }
        // }
        // System.out.println(max2);

        
        //Reverse Array elements and print them.....

        // int arr1[] = { 12, 34, 65, 20,02,78 };
        // int temp, temp2, res;
        // int n = arr1.length;
        // int[] arr2=new int[n];
        // int k = 0;
        // for (int i = 0; i < n; i++) {
        //     temp = arr1[i] % 10;
        //     arr1[i] = arr1[i] / 10;
        //     temp2 = arr1[i] % 10;
        //     res = temp * 10 + temp2;
        //     arr2[k] = res;
        //    System.out.print("\t"+arr2[k]);   
        //    k++;
        // }

        
    }
}
