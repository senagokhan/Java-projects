// Kullanıcıdan Alınan Bir Kelimenin Palindrom Olup Olmadığını Kontrol Eden Java Kodu :

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Palindrom olup olmadığını kontrol etmek istediğiniz kelimeyi giriniz:");
        String kelime = scanner.nextLine();

        int uzunluk = kelime.length();
        boolean palindromMu = true;

        for (int i = 0; i < uzunluk / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(uzunluk - 1 - i)) {
                palindromMu = false;
                break;
            }
        }
        if (palindromMu) {
            System.out.println("Girdiğiniz kelime palindromdur.");
        } else {
            System.out.println("Girdiğiniz kelime palindrom değildir.");
        }
    }
}
