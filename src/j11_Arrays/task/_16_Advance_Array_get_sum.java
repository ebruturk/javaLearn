package j11_Arrays.task;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {
    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.


        String str = "$12 $23 $10 $2 $5 $2";
        String[] arr = str.replace("$", "").split(" ");
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);


    }}


