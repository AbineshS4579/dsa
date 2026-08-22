import java.util.Scanner;

public class binarytree {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        tree t=new tree();
        while(n-->0){
            t.ins(s.nextInt());
        }
        t.show();
    }
}
