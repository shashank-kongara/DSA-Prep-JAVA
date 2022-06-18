import java.util.Arrays;
import java.util.Scanner;

public class sumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] sum= new int[Math.max(n1, n2)];
        int i= arr1.length-1;
        int j= arr2.length-1;
        int k= sum.length-1;
        int carry=0;
        while (k>=0) {
           // int tmp=0;
            int tmp=carry;
            if(i>=0){
                tmp+=arr1[i];
            }
            if(j>=0){
                tmp+=arr2[j];
            }
            carry=tmp/10;
            sum[k]=tmp%10;
            i--;
            j--;
            k--;
            }
        if(carry!=0){
            System.out.println(carry);
        }
        for(int ii:sum){
            System.out.println(ii);
        }
    }
}
