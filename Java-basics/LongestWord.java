// Bir Cümledeki En Uzun Kelimeyi Bulan Java Kodu :

import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz : ");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");

        String enUzunKelime = "";

        for (String kelime : kelimeler) {
            if (kelime.length() > enUzunKelime.length()) {
                enUzunKelime = kelime;
            }
        }

        System.out.print("Cümledeki en uzun kelime : " + enUzunKelime);
    }
}
