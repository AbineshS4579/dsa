public class quick {
    public static void sort(int a[],int l,int h){
        if(l<h){
            int pi=part(a,l,h);
            sort(a,l,pi-1);
            sort(a,pi+1,h);
        }
    }
    static int part(int a[],int l,int h){
        int pi=h-1,i=l-1;
        for(int j=l;j<h;j++){
            if(a[j]<a[pi]){
                i++;
                int t=a[j];
                a[j]=a[i];
                a[i]=t;
            }
        }
        int t=a[i+1];
        a[i+1]=a[pi];
        a[pi]=t;
        return i+1;
    }
    public static void main(String[] args){
        int a[]={7,8,9,2,4,1};
        sort(a,0,a.length);
        for(int i:a)System.out.println(i);
    }
}
