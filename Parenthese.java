package BranchRecursion;
import java.util.ArrayList;
import java.util.List;

public class Parenthese{
    public static void main(String[] args) {
        System.out.println(WellFormParentheses.generate(3));
    }
    

}
class WellFormParentheses{
    public static List<String> generate(int n) {
        List<String> output = new ArrayList<>();
        helper(output,"",0,0,n);
        return output;
    }
    public static void helper(List<String> ans,String currentBracket,int open,int close,int max) {
        if(currentBracket.length()==max*2){
            ans.add(currentBracket);
            return;
        }
        if (open<max) {
            helper(ans, currentBracket+"(", open+1, close, max);
        }
        if (close<open) {
            helper(ans, currentBracket+")", open, close+1, max);
        }
    }
}
