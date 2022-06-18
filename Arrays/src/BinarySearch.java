import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int d= sc.nextInt();
        int i=0;
        int j= arr1.length-1;
        while(i<=j){
             int mid=(i+j)/2;
             if (arr1[mid]<d) {
                j=mid-1;
            }
            else if(arr1[mid]>d) {
                i=mid+1;
            }
            else {
                 System.out.println("found");
                 return;
             }
            i++;
            j++;
    }
        System.out.println("not found");
    }
}
