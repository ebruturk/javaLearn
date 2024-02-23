package j08_Loops.Loops01_ForLoop.Task;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {



    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

        Scanner sc = new Scanner(System.in);
        System.out.print("Satir giriniz: ");
        int satir = sc.nextInt(); // 8

        for (int i = 1; i <= satir; i++) {

            for (int j = satir; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == satir) {
                    System.out.print("* ");
                } else {
                    System.out.print("! ");
                }
            }
            System.out.println();

        }

        //2. YOL
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8 - i; j++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++) {

                if (j == i || j == 0 || i == 7)
                    System.out.print("* ");
                else
                    System.out.print("! ");
            }
            System.out.println();
        }
    }
}

























