public class patterns_sumitsir {
    public static void main(String[] args) {
        int n =5;
        Wpattern(n);
    }
    static void Wpattern(int n) {
        int sp = 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j==1||j==n || (i>n/2&& (i==j || i+j==n+1))){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void swastik(int n) {
        int st = n;
        int sc = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    if (j <= n / 2 + 1 || j == n) {
                        System.out.print("*  ");
                    } else System.out.print("   ");
                } else if (i <n/2+1) {
                    if (j == n / 2 + 1 || j == n) {
                        System.out.print("*  ");
                    } else System.out.print("   ");
                } else if (i == n / 2 + 1) {
                    System.out.print("*  ");
                    }
                else if ( i < n) {
                    if (j == 1 || j == n / 2 + 1) {
                        System.out.print("*  ");
                    } else System.out.print("   ");
                } else {
                    if (j == 1 || j >= n / 2 + 1) {
                        System.out.print("*  ");
                    } else System.out.print("   ");


            }
        }

        System.out.println();
    }

    }
    static void pattern_inv_pyramid_spl(int n) {
        int st = n;
        int sc = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sc; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= st; j++) {
                if(i>1 && i<=n/2 && j>1 && j<st){
                    System.out.print("  ");
                }
                else System.out.print("* ");
            }

            if (i <= n / 2) {
                st -= 2;
                sc++;
            } else {
                st += 2;
                sc--;
            }
            System.out.println();
        }

    }


    static void pattern_spl4(int n) {
        int sp = n/2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=sp ; j++) {
                if(i==n/2+1){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }

            for (int j = 1; j <=st; j++) {
                System.out.print("* ");
            }
            if(i<=n/2){
                st++;
            }
            else st--;
            System.out.println();
        }
    }
    static void pattern_spl3(int n) {
        int sp = 2*n-3;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            int val=1;
            for (int j = 1; j <=st ; j++) {
                System.out.print(val+" ");
                val++;
            }
            for (int j = 1; j <=sp ; j++) {
                System.out.print("  ");
            }
            if(i==n){
                st--;
                val--;
            }
            int cval=val;
            for (int j = 1; j <=st ; j++) {
                cval--;
                System.out.print(cval+" ");
            }
            st++;
            sp-=2;
            System.out.println();
            }
        }

    static void pattern_num(int n) {
       int m=1;
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n+"*"+m+"="+n*m);
            m++;
        }
            System.out.println();
        }

    static void pattern2(int n) {
        int sp = 2;
        int st = 1;
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= sp; i++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }
            if (row <= n / 2) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
            System.out.println();
        }
    }
    static void pattern_spl2(int n) {
        int sp = 2;
        int st = 1;
        int w=1;
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= sp; i++) {
                System.out.print("  ");
            }
            int q=w;
            for (int j = 1; j <= st; j++) {
                System.out.print(q +" ");
                if(j<=st/2){
                    q++;
                }
                else q--;
            }

            if (row <= n / 2) {
                sp--;
                st += 2;
                w++;
            } else {
                sp++;
                st -= 2;
                w--;
            }

            System.out.println();

        }
    }
    static void pattern(int n) {
        int sp = 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j == n + 1 || i == j) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern_diamond_spl(int n) {
        int nos = n / 2;
        int nis = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nos; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 1; j <= nis; j++) {
                System.out.print("\t");
            }
            if (i > 1 && i < n) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                nos--;
                nis += 2;
            }
            else {
                nos++;
                nis -= 2;
            }
            System.out.println();
        }
    }

    static void pattern_diamond_spl1(int n) {
        int nos = n / 2;
        int nis = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nos; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 1; j <= nis; j++) {
                System.out.print("\t");
            }
            if (i > 1 && i < n) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                nos--;
                nis += 2;
            }
            else {
                nos++;
                nis -= 2;
            }
            System.out.println();
        }
    }
}