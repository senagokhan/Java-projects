// Bir Cümledeki Tüm Kelimelerin İlk Harfini Büyük Harfe Dönüştüren Java Kodu :

import java.util.Scanner;

public class UpperFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz : ");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");

        StringBuilder sonuc = new StringBuilder();
        for (int i = 0; i < kelimeler.length; i++) {
            String kelime = kelimeler[i];
            if (!kelime.isEmpty()) {
                String yeniKelime = kelime.substring(0, 1).toUpperCase() + kelime.substring(1).toLowerCase();
                sonuc.append(yeniKelime);
            }
            if (i < kelimeler.length - 1) {
                sonuc.append(" ");
            }
        }
        System.out.print("Değiştirilmiş cümle: " + sonuc.toString());
    }
}
