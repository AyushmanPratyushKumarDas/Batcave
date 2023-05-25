import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class HQ_04 {
    public static void PrintArraySorted(int a[])
    {
        for(int i = 0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
    }
 public static String sorting(int a[],int k,int idxk,int idx,int idxe)
 {
     //idx is starting index
     //idxe is ending index
     if(idx==idxe) {
         return "dont";}
     int p=0;
     int start = idx;
      if (k<=a[start]) {
          sorting(a, k,idxk, idx + 1, idxe - 1);
          return "false";
      }
      else{
      return "true";
      }
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={1,2,3,4,5,6};
        int b[]={4,2,9,10,24,33};
        System.out.println(sorting(b,4,3,0,5));
        System.out.println(sorting(a,5,4,0,5));


    }
}
