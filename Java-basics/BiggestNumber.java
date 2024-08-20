// Kullanıcıdan Alınan Üç Sayı Arasından En Büyüğünü bulan Java Kodu:

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        int birinci = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int ikinci = scanner.nextInt();
        System.out.print("Üçüncü sayıyı giriniz : ");
        int ucuncu = scanner.nextInt();

        int enbuyuk = birinci;
        if(ikinci > enbuyuk)
            enbuyuk = ikinci;

        if (ucuncu > enbuyuk) {
            enbuyuk = ucuncu;
        }

        System.out.println("En büyük sayı : " + enbuyuk);

    }
}
