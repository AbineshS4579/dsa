public class tree {
    node ro;
    public void ins(int n){
        ro=insd(ro,n);
    }
    public node insd(node ro,int n){
        if(ro==null){
            ro=new node(n);
        }else if(n>ro.val){
            ro.ri=insd(ro.ri,n);
        }
        else if(n<ro.val){
            ro.le=insd(ro.le,n);
        }
        return ro;
    }
    public void show(){
        pr(ro);
    }
    public void pr(node ro){
        if(ro!=null){
            pr(ro.le);
            System.out.println(ro.val+" ");
            pr(ro.ri);
        }
    }
}
