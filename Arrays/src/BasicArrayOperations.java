import java.util.Arrays;

public class BasicArrayOperations {
    public static void main(String[] args) {
        int[] one=new int[5];
        one[0]=1;
        one[1]=2;
        one[2]=3;
        one[3]=4;
        one[4]=5;

        System.out.println(Arrays.toString(one));

        System.out.println(maxElement(one));

        System.out.println(Arrays.toString(reverseArray_bySwap(one)));
    }
    static void swap(int[] arr, int n1, int n2){
        int t=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=t;
    }
    static int maxElement(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int[] reverseArray_bySwap(int[] arr){
        int[] f=arr;
        int start=0;
        int end= arr.length-1;
        while (start<end){
            swap(f,start,end);
            start++;
            end--;
        }
        return f;
    }
    public static void reverseArray_Sumitsir(int[] a){
        int li = 0;
        int ri = a.length - 1;

        while(li < ri){
            int temp = a[li];
            a[li]= a[ri];
            a[ri] = temp;

            li++;
            ri--;
        }
    }
}
