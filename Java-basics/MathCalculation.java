// Girilen İki Sayıya Dört İşlem Uygulayan Java Kodu :

import java.util.Scanner;

public class MathCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İki sayı giriniz:");
        int sayi = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        System.out.println(" Sayıların toplamı : " + (sayi+sayi2));
        System.out.println(" Sayıların farkı : " + (sayi-sayi2));
        System.out.println(" Sayıların çarpımı : " + (sayi*sayi2));
        System.out.println(" Sayıların bölümü : " + (sayi/sayi2));

    }
}

