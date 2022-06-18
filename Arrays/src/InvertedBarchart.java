import java.util.Scanner;

public class InvertedBarchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max=maxValue(arr);
        for (int i = 0; i <max ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (arr[j]<=i){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
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
}
