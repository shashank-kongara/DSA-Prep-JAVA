import java.util.Scanner;

public class firstAndLastIndex_usingBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int i = 0;
        int j = arr1.length - 1;
        int first=0;
        int last=0;
        while (i<=j){
            int mid=(i+j)/2;
            if(d>arr1[mid]){
                i=mid+1;

            } else if (d<arr1[mid]) {
                j=mid-1;

            }
            else if(d==arr1[mid]){
                last=mid;
                i=mid+1;
            }
            else return;
            }
        int i2 = 0;
        int j2 = arr1.length - 1;
        while (i2<=j2){
            int mid=(i2+j2)/2;
            if(d>arr1[mid]){
                i2=mid+1;

            } else if (d<arr1[mid]) {
                j2=mid-1;

            }
            else if(d==arr1[mid]){
                first=mid;
                j2=mid-1;
            }
            else return;
        }

        System.out.println("first:"+" "+first);
        System.out.println("last"+" "+last);

    }

    }
