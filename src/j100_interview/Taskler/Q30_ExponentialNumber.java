import java.util.Scanner;

public class Q30_ExponentialNumber {
    //Task->
    // Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // Girilen taban ve us değerleri için sayının kuvvetini print eden code create ediniz.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {
      /*  Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değerini girin: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini girin: ");
        int us = scanner.nextInt();

        // Kuvveti hesapla
        int kuvvet = 1;

        for (int i = 0; i < us; i++) {
            kuvvet *= taban;
        }

        System.out.println("Sonuç: " + kuvvet);

        scanner.close();*/

            Scanner input = new Scanner(System.in);
            System.out.println("gakgom taban girisin : ");
            int taban = input.nextInt();
            System.out.println("gakgom üss girisin : ");
            int uss = input.nextInt();
            int sonuc = 1;

            System.out.println("   ***   for lopp   ***   ");
            //  for (int i = 1; i <= uss; i++) {
            //      sonuc *= taban;
            //  }
            System.out.println("sonuc = " + sonuc);//


            System.out.println("   ***   while lopp   ***   ");
            while (uss != 0) {

                sonuc *= taban;
                uss--;
            }
            System.out.println("sonuc = " + sonuc);//

        }
    }


