
import java.util.*;

public class oprationstack {
    public static void main(String[] args){
        Stack<Integer> l=new Stack<>();
        String s="2 + 3 * 4";
        char h='+';
        for(char i:s.toCharArray()){
            if(Character.isDigit(i)) {
                if (h == '+') l.push(i - '0');
                else if (h == '-') l.push(-(i - '0'));
                else if (h == '*') l.push(l.pop() * (i - '0'));
                else if (h == '/') l.push(l.pop() / (i - '0'));
            }
            else if(i!=' ')h=i;
        }
        int sum=0;
        for(int i:l){
            sum+=i;
        }
        System.out.println(sum);
   }
}
