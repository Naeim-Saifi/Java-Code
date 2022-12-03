package BranchRecursion;
import java.util.*;
public class letterComPhn {
    static  List<String> result=null;
  static  String[] mapping=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static List<String> letterCombinations(String digits){
        result=new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        helper(0,digits,new StringBuilder());
        return result;
    }
   static void helper(int length,String digits,StringBuilder temp){
        if(length==digits.length()){
            result.add(temp.toString());
            return;
        }
        char ch=digits.charAt(length);
        String str=mapping[ch-'0'];
        for(char c:str.toCharArray()){
            temp.append(c);
            helper(length+1, digits, temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
