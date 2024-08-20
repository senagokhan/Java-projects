// Kullanıcıdan Alınan Girdiler ile Sayının Üssünü Bulan Java Kodu:

import java.util.Scanner;

public class ExponentiationOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssünü almak istediğiniz sayıyı giriniz : ");
        int taban = scanner.nextInt();
        System.out.print("Üssün derecesini giriniz :");
        int us = scanner.nextInt();
        double sonuc = Math.pow(taban, us);
        System.out.println(taban + " üzeri " + us + " = " + sonuc);

    }
}
