// Kullanıcıdan Alınan Cümlede Belirli Bir Kelimenin Kaç Kez Geçtiğini Hesaplayan Java Kodu :

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle giriniz : ");
        String cumle = scanner.nextLine();

        System.out.print("Sayılmasını istediğiniz kelimeyi giriniz : ");
        String arananKelime = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");

        int kelimeSayisi = 0;

        int index = 0;
        while (index < kelimeler.length) {
            if (kelimeler[index].equals(arananKelime)) {
                kelimeSayisi++;
            }
            index++;
        }

        System.out.println("Cümlede '" + arananKelime + "' kelimesi " + kelimeSayisi + " kez geçmektedir.");
    }
}
