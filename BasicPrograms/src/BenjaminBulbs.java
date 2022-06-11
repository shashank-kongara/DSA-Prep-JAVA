import java.util.Scanner;
/*
here the trick is for every perfect square number it has 2n+1 factors so bulb will get on as default is oFF
*/

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            System.out.println(i*i);
        }
    }
}
