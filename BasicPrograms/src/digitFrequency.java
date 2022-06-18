import java.util.Scanner;

public class digitFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(freq(n,d));

    }
    static int freq(int n, int d){
        int count=0;
        while (n!=0){
            if(n%10==d){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}
