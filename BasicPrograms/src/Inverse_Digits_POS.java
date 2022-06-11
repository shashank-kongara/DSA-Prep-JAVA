import java.util.Scanner;

/*  inv => inverse number
    op => original pos
    od => orginal dig
    id => inverse dig
    ip => inverse pos

    number - 4123
    op  od  => ip   id
    1   3       3   1   => adding ip*pow(10,dig-1) -- 3*pow(10,1-1) =3
    2   2       2   2                                 2*pow(10,1)   =20
    3   1       1   3                                 23+100=123
    4   4       4   4                                 4000+123=4123

    2 5 7 8 - od

    */

public class Inverse_Digits_POS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inv=0;
        int op=1;
        while (n!=0){
            int od=n%10;
            int id=op;
            int ip=od;
            inv+=id*(int) Math.pow(10,ip-1);
            n=n/10;
            op++;
        }
        System.out.println(inv);
    }

}
