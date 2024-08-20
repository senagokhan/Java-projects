// Girilen Sayının Çift veya Tek Olduğunu Bulan Java Kodu :

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println(sayi + " sayısı bir çift sayıdır.");
        } else {
            System.out.println(sayi + " sayısı bir tek sayıdır.");
        }
    }
}
