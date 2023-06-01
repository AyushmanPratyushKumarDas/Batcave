public class Q5_a_2017 {
    public static int binary(int a[],int p,int start,int end)
    {
        if(end>start){return -1;}
        int mid = (start+end)/2;
        if(a[mid]==p){return mid;}
        else if (a[mid]>p){
            return binary(a,p,start,mid-1);
        }
        else
           return binary(a,p,mid+1,end);
    }
}
