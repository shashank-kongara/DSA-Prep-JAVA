import java.util.Scanner;

public class spiralTraversal {

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

        int minr=0;
        int minc=0;

        int maxr=r1-1;
        int maxc=c1-1;

        int tne=r1*c1;
        int tie=0;

        while(tie<tne){
            // lft wall
            for (int i=minr;i<=maxr && tie<tne;i++){
                System.out.println(one[i][minc]);
                tie++;
            }
            minc++;


            // botttom wall
            for (int i=minc;i<=maxc && tie<tne;i++){
                System.out.println(one[maxr][i]);
                tie++;
            }
            maxr--;

            //right wll
            for (int i=maxr;i>=minr && tie<tne;i--){
                System.out.println(one[i][maxc]);
                tie++;
            }
            maxc--;

            // top wall
            for (int i=maxc;i>=minc && tie<tne;i--){
                System.out.println(one[minr][i]);
                tie++;
            }
            minr++;



        }
    }
    }
