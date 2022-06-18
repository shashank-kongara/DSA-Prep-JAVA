import java.util.Scanner;

public class spanOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(maxValue(arr) - minValue(arr));

    }


    static int maxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max ){
                max = arr[i];
            }
        }
        System.out.println("max:"+max);
        return max;
    }
    static int minValue(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("min:"+min);
        return min;
    }
}
