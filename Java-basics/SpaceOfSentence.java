// Kullanıcıdan Alınan Cümlede Kaç Adet Boşluk Karakteri Olduğunu Bulan Java Kodu :

import java.util.Scanner;

public class SpaceOfSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz : ");
        String cumle = scanner.nextLine();
        int boslukSayisi = 0;

        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') {
                boslukSayisi++;
            }
        }
        System.out.println("Cümledeki boşluk karakteri sayısı: " + boslukSayisi);
    }
}
