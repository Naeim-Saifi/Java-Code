public class Pattern {
    public static void main(String[] args) {
        // *
        // ** 
        // ***
        // ****
        // *****
        int row= 5;
        int col= 5;
        int i,j;
        for(i=0;i<5;i++){
            for(j =0;j<5;j++){
                if(i==0 || j==0 || i==row-1 || j==col-1 ||(i==2 && j==2))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
         
        System.out.println();  
        }
    }
    }
