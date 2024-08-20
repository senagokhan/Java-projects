// Basit Faiz Hesaplayan Java Kodu:

import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anapara miktarını giriniz : ");
        double anapara = scanner.nextDouble();

        System.out.print("Yıllık faiz oranını giriniz (% olarak) : ");
        double faizOrani = scanner.nextDouble();

        System.out.print("Vade süresini giriniz(yıl olarak) : ");
        double vade = scanner.nextDouble();

        double faizMiktari = (anapara * faizOrani * vade) / 100;
        double toplamTutar = anapara + faizMiktari;

        System.out.printf("Toplam tutar: %.2f%n", toplamTutar);
    }
}