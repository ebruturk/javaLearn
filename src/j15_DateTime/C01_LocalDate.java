package j15_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    // LocalDate  -> sadece gun-ay-yıl datatlarını tutar(stored)
    public static void main(String[] args) {
        LocalDate bugun =  LocalDate.now();
        //Trick->LocalDate variable için new keyword kullanılmaz->kullanırsa CTEhatası verir.
        System.out.println("bugun = " + bugun);//2024-02-26
        System.out.println("bugun.getYear() = " + bugun.getYear());//2024
        System.out.println("bugun.getMonth() = " + bugun.getMonth());//FEBRUARY
        System.out.println("bugun.getDayOfMonth() = " + bugun.getDayOfMonth());//26
        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());//57
        System.out.println("bugun.getDayOfWeek() = " + bugun.getDayOfWeek());//MONDAY
        System.out.println("bugun.getMonthValue() = " + bugun.getMonthValue());//2

        System.out.println("****");
        LocalDate tarih1=LocalDate.of(1974,8,22);
        LocalDate tarih2=LocalDate.of(1985, Month.MARCH,12);
        //tanimlanan bir date oncesi minus() ->sonrasinda ise plus() meth kullanilir
        System.out.println("tarih1 = " + tarih1);
        System.out.println(tarih1.minusYears(34).plusMonths(34).plusDays(34));
        System.out.println("tarih1 = " + tarih1);

    }
    }

