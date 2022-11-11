public class Calc {
    public static void main(String[] args) {
        int fnum = Integer.parseInt(args[0]);
        int lnum = Integer.parseInt(args[2]);
        String opr = args[1];
        int res = 0;
        if (opr.equals("+")) {
            res = fnum + lnum;
        } 
        else if (opr.equals("-")) {
            res = fnum - lnum;
        } 
        else if (opr.equals("/")) {
            res = fnum / lnum;
        }
         else if (opr.equals("x")) {
            res = fnum * lnum;
        }
        System.out.println("Result ::"+res);
    }
}
