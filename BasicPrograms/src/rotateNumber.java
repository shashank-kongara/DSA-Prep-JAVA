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

}
