import java.util.Stack;

public class stackpost {
    static int pr(char c){
        if(c=='^')return 3;
        else if(c=='*'||c=='/')return 2;
        else if(c=='+'||c=='-')return 1;
        return -1;
    }
    static void post(String s){
        String d="";
        Stack<Character> t=new Stack<>();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
               d+=c;
            }
            else if(c=='('){
                t.push(c);
            }
            else if(c==')'){
                while(!t.isEmpty()&&t.peek()!=')'){
                   d+= t.pop();
                }
                t.pop();
            }
            else {
                while (!t.isEmpty() && pr(c) <= pr(t.peek())) {
                    d += t.pop();
                }
                t.push(c);
            }
        }
        while(!t.isEmpty()){
            d+=t.pop();
        }
        System.out.println(d);
    }
    public static void main(String[] args){
        String s="a+b*g/8";
        post(s);
    }
}
