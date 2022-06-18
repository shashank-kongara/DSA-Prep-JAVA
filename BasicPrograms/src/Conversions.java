import java.util.Scanner;
public class Conversions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bs=sc.nextInt();
        int bt=sc.nextInt();
        System.out.println(AnyBasetoAnyBase(n,bs,bt));

    }
    static int AnyBasetoAnyBase(int n, int bs, int bt){
        int n1=AnyBaseTODecimal(n,bs);
        return DecimaltoAnyBase(n1,bt);
    }
    static int AnyBaseTODecimal(int n, int b){
        int s=0;
        int pwr=-1;
        while (n>0){
            int r=n%10;
            pwr++;
            s+=r*Math.pow(b,pwr);
            n=n/10;
        }
        return s;
    }
    static int DecimaltoAnyBase(int n, int b){
        int s=0;
        int pwr=-1;
        while (n>0){
            int r=n%b;
            pwr++;
            s+=r*Math.pow(10,pwr);
            n=n/b;
        }
        return s;
    }
}
