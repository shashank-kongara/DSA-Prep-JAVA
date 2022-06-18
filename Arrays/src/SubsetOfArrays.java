import java.util.Scanner;

public class SubsetOfArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

     //   aprroach-1 using string---

/*        for (int i = 0; i <(int)Math.pow(2,arr1.length) ; i++) {
            String subset="";
            int tmp=i;
            for (int j=arr1.length-1; j >= 0 ; j--) {

             // try changing 0 to arr.len it will just order of print ..use accordingly

                int r=tmp%2;
                tmp=tmp/2;
                if(r==0){
                    subset="-\t"+subset;
                }
                else {
                    subset=arr1[j]+"\t"+subset;

                     // try changing +=..it will just order of print ..use accordingly
                }
            }
            System.out.println(subset);
        }*/

        // approach -2 without string, using function to convert into binary

        for (int i = 0; i <(int)Math.pow(2,arr1.length); i++) {
            int binary=DecimaltoAnyBase(i,2);
            int div=(int) Math.pow(10,arr1.length-1);
            for (int j = 0; j <arr1.length ; j++) {
                int q=binary/div;
                int r=binary%div;
                if(q==0){
                    System.out.print("-"+"\t");
                }
                else{
                    System.out.print(arr1[j]+"\t");
                }
                div=div/10;
                binary=r;
            }
            System.out.println();
        }

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
