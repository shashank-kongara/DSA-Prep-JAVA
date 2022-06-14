public class Patterns {
    public static void main(String[] args) {
        int n =6;
        pattern(n);


    }
   static void pattern(int n) {
       for (int i = 0; i <= n; i++) {
           int c = i <= n/2? 2*i+1 : n-(2*i+1);
           for (int j = 0; j <=c; j++) {
               System.out.print("* ");
           }
           for (int k = 0; k <n-c; k++) {
               System.out.print("  ");
           }


           System.out.println();
       }
   }
    static void pattern1_i1(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int c = i <= n ? i : (2 * n - i);
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern1_i2 ( int n){
        for (int i = 0; i < 2 * n; i++) {
            int c = i <= n ? i : (2 * n - i);
            for (int j = 0; j < c; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pyramid_up( int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <2*i+1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pyramid_down( int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <2*n-(2*i+1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pyramid_down2( int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <2*i-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void diamond ( int n){
        for (int i = 0; i < 2 * n; i++) {
            int c = i <= n ? i : (2 * n - i);
            for (int k = 0; k < n-c; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern17 (int n){
        for (int i = 1; i <=  n; i++) {
            for (int k = 0; k < n-i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) {
                System.out.print(j);
            }
            for (int l = 2; l <=i ; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

