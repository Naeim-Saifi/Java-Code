public class countdigit {
    public static void main(String[] args) {
        // int num=2345;
        // int count =0;
        // while(num!=0)
        // {
        //     num=num/10;
        //     count++;
        // }

        // System.out.println(count);



        
        //Count Zero in a number
        int num=10308;
        int count=0;
        int res;
        while(num!=0){
           res =num%10;
           num=num/10;
            if(res==0){
                count++;
            }
        }
        System.out.println("Zero"+count);
    }
}
