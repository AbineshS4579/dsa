public class bubble {
    public static void main(String[] args){
        int a[]={4,64,7,8,9,1,3};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}
