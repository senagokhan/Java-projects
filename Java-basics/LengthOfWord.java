// Bir Cümlede Geçen Her Kelimenin Uzunluğunu Hesaplayan Java Kodu :

import java.util.Scanner;

public class LengthOfWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz : ");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");

        for (String kelime : kelimeler) {
            System.out.println(kelime + ": " + kelime.length());
        }
    }
}
