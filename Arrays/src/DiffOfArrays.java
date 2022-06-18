import java.util.Scanner;

public class DiffOfArrays {
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
        int[] diff= new int[Math.max(n1, n2)];
        int i= arr1.length-1;
        int j= arr2.length-1;
        int k= diff.length-1;
        int carry=0;
        while (k>=0) {
            int tmp=0;
            int alv=i>=0?arr1[i]:0;
            if(arr2[j]+carry>=alv){
                tmp=arr2[j]+carry-alv;
                carry= 0;
            }
            else {
                tmp=arr2[j]+carry+10-alv;
                carry= -1;
            }
            diff[k]=tmp;

            i--;
            j--;
            k--;
        }
        int idx=0;
        while (idx< diff.length){
            if(diff[idx]==0){
                idx++;
            }
            else break;;

        }
        while(idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }

    }
}
