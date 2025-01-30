import java.util.Stack;

public class leetcode_20 {
    public static void main(String[] args) {
        String s = "({[{}]})";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        String opnBracket = "([{";
        String clsBracket = "}])";

        Stack<Character> stk = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (opnBracket.indexOf(ch) !=-1){
                stk.push(ch);
            }else{
                if (stk.size()==0){
                    return false;
                }else{
                    char temp = stk.pop();
                    if (getChar(ch) != temp){
                        return false;
                    }
                }
            }
        }
        return stk.size()==0;
    }
    public static char getChar(char ch){
        switch (ch){
            case ']':return '[';
            case ')':return '(';
            case '}':return '{';
            default: return ' ';
        }
    }
}
