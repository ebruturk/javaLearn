package j11_Arrays.task;

public class _07_array_max_value {
    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here
int[]arr={12,2,5,15,8};
int max=arr[0];
for(int i=0; i<arr.length; i++){
    if(arr[i]>max){
        max=arr[i];
    }
    }

    // Toplamı yazdır
    System.out.println("En büyük sayı: " + max);
}

    }


