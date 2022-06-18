import java.util.Arrays;
import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n1];
        for (int k = 0; k < arr1.length ; k++) {
          int tmp=0;
          tmp=arr1[k];
          arr2[tmp]=k;
        }
        System.out.println(Arrays.toString(arr2));



    }

}

