import java.util.Scanner;
/* my approach */
public class rotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int tmp=n;
        int nod=0;
        while (tmp!=0){
            tmp=tmp/10;
            nod++;
        }
        if(k>nod){
            k=k%10;
        }
        while(k<0){
            k=k+nod;
        }
        int rot_final=0;

            int r=n%(int) Math.pow(10,k);
            int dd=n/(int) Math.pow(10,k);
            int q=(int) Math.pow(10,nod-k);
            rot_final+=(r*q)+dd;


        System.out.println(rot_final);
    }

 /*  sumit sir approach --
https://youtu.be/lt8oCGqYMGg?list=TLGGeP-6ACGwCAAxNTA2MjAyMg

  public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int nod = 0;
        int temp = n;
        while (temp != 0) {
            temp /= 10;
            nod++;
        }

        k = k % nod;
        if (k < 0)
            k += nod;

        int div = 1;
        int mult = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k)
                div *= 10;
            else
                mult *= 10;
        }

        int quo = n / div;
        int rem = n % div;

        int r = rem * mult + quo;
        System.out.println(r);
    }*/
}
