package j99_codeChallange.Chalenge07;

import java.util.Scanner;

public class Task01 {



        /* Task->
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */


      //public static void main(String[] args) {
      //    Scanner input = new Scanner(System.in);
      //    System.out.println("Agıdeşşş  bi  kelime girive bakennn : ");
      //    String kelime = input.next();
      //    System.out.println("   ***  if cozum   ***   ");
      //    if (kelime.contains("xyz")) {
      //        System.out.println(true);

      //    }else
      //    System.out.println(false);
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Agam hele bi seyler giresen : ");

                String str = input.nextLine();

                xyzVarmi1(str);
                System.out.println(xyzVarmi2(str));
                System.out.println(xyzVarmi3(str));
            }//main sonu

            private static boolean xyzVarmi3(String str) {

                return str.contains("xyz") ? true : false;// ternary
            }

            private static boolean xyzVarmi2(String str) {
                if (str.contains("xyz")) {
                    return true;
                }
                return false;
            }

            private static void xyzVarmi1(String str) {
                System.out.println(str.contains("xyz") ? "true" : "false");

            }
        }//Class sonu




