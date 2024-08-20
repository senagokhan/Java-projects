// Bir Cümledeki Kelimeleri Tersten Sıralayarak Ekrana Yazdıran Java Kodu :

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz : ");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");

        System.out.print("Girdiğiniz cümledeki kelimelerin ters sıralaması : ");
        for (int i = kelimeler.length - 1; i >= 0; i--) {
            System.out.print(kelimeler[i] + " ");
        }
    }
}
