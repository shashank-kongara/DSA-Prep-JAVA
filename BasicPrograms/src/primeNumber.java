import java.util.Scanner;
public class primeNumber {
/* Brute Force Solution -1


            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n=sc.nextInt();
                for (int i = 1; i <=n ; i++) {
                    int num = sc.nextInt();
                    System.out.println(isPrime(num));
                }
            }
            static boolean isPrime(int n) {
                int i=2;
                while(i<n){
                    if(n%i==0){
                        return false;
                    }
                    i+=1;
                }
                return true;
            }

        */

/* Brute Force Solution -2

        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            for (int i = 1; i <=n ; i++) {
                int num = sc.nextInt();
                int count =0;
                for (int j = 2; j < num; j++) {
                    if(num%j==0){
                        count+=1;
                    }
                }
                if(count==0) System.out.println("prime");
                else System.out.println("not prime");
            }
        }
 */

/* Optimized - o(rootN) */

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for (int i = 1; i <=n ; i++) {
        int num=sc.nextInt();
        int count=0;
        /* for (int j = 2; j*j <=num; j++) */
        int j = 2;
        while (j <= Math.sqrt(num)) {
            if(num%j==0){
                count++;
                break; /* if we remove break.. it is correct code but even after getting our 1st factor
                we are still running loop..which may take more time.. So to optimize the code we added break statement */
            }
            j++;
        }
        if (count != 0) System.out.println("not prime");
        else System.out.println("prime");
    }
}
/*
=> print prime numbers in range - o(rootN)

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high= sc.nextInt();
        for (int i = low; i <=high ; i++) {
            int count=0;
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                if(i%j==0) {
                    count++;
                    break;
                }
            }
            if(count==0) System.out.println(i);
        }
    }
 */
}
