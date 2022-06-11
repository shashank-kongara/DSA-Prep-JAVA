import java.util.Scanner;
public class primeFactors {
/*
 my approch --------------
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div=2;
        while (div<=Math.sqrt(n)){
            if(n%div==0){
                int q=n/div;
                System.out.println(div);
                n=q;
            }
            else {
                div++;
            }
        }
        if(n!=0){  /* it is just to print the last prime factor bcz we used sqrt(n) to optimize, */
            System.out.println(n);
        }
    }

 /*   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int div = 2; div*div < n; div++) {
            while (n%div==0){
                System.out.println(div);
                n=n/div;
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }*/
}

