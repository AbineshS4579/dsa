public class selection {
    public static void main(String[] args){
        int a[]={5,7,2,1,8,9,0};
        for(int i=0;i<a.length-1;i++){
            int m=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[m])m=j;
            }
            int t=a[i];
            a[i]=a[m];
            a[m]=t;
        }
        for(int i:a)System.out.println(i);
    }
}
