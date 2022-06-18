import java.util.Scanner;

public class waveTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] one = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                one[i][j] = sc.nextInt();
            }
        }

        for (int col = 0; col < c1; col++) {
            if(col%2==0){
                for (int row = 0; row <r1 ; row++) {
                    System.out.println(one[row][col]);
                }
            }
            else {
                for (int row = r1-1; row >=0; row--) {
                    System.out.println(one[row][col]);
                }
            }
        }
    }
}
