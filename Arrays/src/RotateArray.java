import java.util.Arrays;
import java.util.Scanner;
// follow sumit sir approach bottom one;
//  1.18sec 80392kb -mine
//  0.93sec 80876kb - sumit sir's
// https://youtu.be/8RErc0VXAo8?list=TLGG1zHTgsOYrtcxNTA2MjAyMg

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        while(k<0) {  // handling negative values
                k += n1;
        }
        k=k% arr1.length; // handling greater than values


        System.out.println(k);

        for (int w = 0; w < k; w++) {
            int i=0;
            int j=arr1.length-1;
            while (i <=arr1.length - 1) {
                swap(arr1, i, j);
                i++;
            }
        }
       System.out.println(Arrays.toString(arr1));
    }
    static void swap(int[] arr1, int i, int j){
        int tmp=arr1[i];
        arr1[i]=arr1[j];
        arr1[j]=tmp;
    }
    /* sumit sir approach best--optimized

    public static void reverse(int[] a, int li, int ri){
        while(li < ri){
            int temp = a[li];
            a[li]= a[ri];
            a[ri] = temp;

            li++;
            ri--;
        }
    }

    public static void rotate(int[] a, int k){
        k = k % a.length;
        if(k < 0){
            k += a.length;
        }

        reverse(a, 0, a.length - k - 1);
        reverse(a, a.length - k, a.length - 1);
        reverse(a, 0, a.length - 1);
    }*/
}
