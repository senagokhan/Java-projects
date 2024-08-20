// Bir Kelimedeki Sesli ve Sessiz Harfleri Hesaplayan Java Kodu :

import java.util.Scanner;

public class VolwelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String kelime = scanner.nextLine();

        int sesliHarfSayisi = 0;
        int sessizHarfSayisi = 0;

        String sesliHarfler = "aeiouAEIOUöÖüÜıI";

        for (int i = 0; i < kelime.length(); i++) {
            char karakter = kelime.charAt(i);
            if (sesliHarfler.indexOf(karakter) != -1) {
                sesliHarfSayisi++;
            } else if (Character.isLetter(karakter)) {
                sessizHarfSayisi++;
            }
        }
        System.out.println("Sesli harf sayısı: " + sesliHarfSayisi);
        System.out.println("Sessiz harf sayısı: " + sessizHarfSayisi);
    }
}
