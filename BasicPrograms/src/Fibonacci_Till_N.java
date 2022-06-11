import java.util.Scanner;
/* Fibonacci till N numbers */
public class Fibonacci_Till_N {
/*    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int low=0;
        int high=1;
        System.out.println(low);
        System.out.println(high);
        for (int i = 2; i < n ; i++) {
            int sum=0;
            sum=low+high;
            System.out.println(sum);
            low=high;
            high=sum;
        }
    }
*/
/* Alternate approach => Fibonacci till N numbers */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int low=0;
        int high=1;
        for (int i = 0; i <n ; i++) {
            System.out.println(low);  /* just print that 1st 0 and just thin of summing it and replacing it with high */
            int sum=low+high;
            low=high;
            high=sum;
        }
    }
}
