import java.util.Scanner;

public class subArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length ; i++) {
            for (int j = i; j < arr1.length; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr1[k]+"  ");
                }
                System.out.println();
            }
        }

    }

}
