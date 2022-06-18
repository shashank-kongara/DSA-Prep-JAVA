import java.util.Scanner;

// used binary search -- input sorted array

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int i=0;
        int j= arr1.length-1;
        int ceil=Integer.MIN_VALUE;
        int floor=Integer.MAX_VALUE;
        while (i<=j){
            int mid=(i+j)/2;
            if(d>arr1[mid]){
                i=mid+1;
                floor=arr1[mid];
            } else if (d<arr1[mid]) {
                j=mid-1;
                ceil=arr1[mid];
            }
            else {
                ceil=arr1[mid];
                floor=arr1[mid];
                return;
            }

        }
        System.out.println("floor:"+floor+" "+"ceil:"+ceil);





    }

}
