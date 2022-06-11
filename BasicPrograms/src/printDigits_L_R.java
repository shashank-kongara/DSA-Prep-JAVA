import java.util.Scanner;

public class printDigits_L_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nod=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            nod++;
        }
        int div =(int)Math.pow(10,nod-1);
        while(div!=0){ /* IMP ** here if we use n!=0...all 0's will be skipped */
            int q = n/div;
            System.out.println(q);
            n=n%div;
            div=div/10;

        }
    }
}
