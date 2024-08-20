//1- Girilen İki Sayıya Dört İşlem Uygulayan Java Kodu :

import java.util.Scanner;

public class matHes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İki sayı giriniz:");
        int sayi = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        System.out.println(" Sayıların toplamı : " + (sayi+sayi2));
        System.out.println(" Sayıların farkı : " + (sayi-sayi2));
        System.out.println(" Sayıların çarpımı : " + (sayi*sayi2));
        System.out.println(" Sayıların bölümü : " + (sayi/sayi2));

    }
}


/*2- Girilen Sayının Çift veya Tek Olduğunu Bulan Java Kodu :

import java.util.Scanner;
class CiftTek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println(sayi + " sayısı bir çift sayıdır.");
        } else {
            System.out.println(sayi + " sayısı bir tek sayıdır.");
        }
    }
}
*/


/*3-  Basit Faiz Hesaplayan Java Kodu:

import java.util.Scanner;
class FaizHesap {
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
*/


/*4 – Girilen Nota Göre Dersten Geçme-Kalma Durumunu Hesaplayan Java Kodu :

import java.util.Scanner;
class DersNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Notunuzu giriniz (100'lük sistemde) : ");
        int not = scanner.nextInt();

        if (not < 50)
            System.out.println("Dersten başarısız oldunuz!");
        else if (not >= 50) {
            System.out.println("Dersi geçtiniz!");
        }

    }
}
*/


/*5 -Kullanıcıdan Alınan Girdiler ile Sayının Üssünü Bulan Java Kodu:

import java.util.Scanner;
class UsAlma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssünü almak istediğiniz sayıyı giriniz : ");
        int taban = scanner.nextInt();
        System.out.println("Üssün derecesini giriniz :");
        int us = scanner.nextInt();
        double sonuc = Math.pow(taban, us);
        System.out.println(taban + " üzeri " + us + " = " + sonuc);

    }
}
 */


/*6 - Kullanıcıdan Alınan Üç Sayı Arasından En Büyüğünü bulan Java Kodu:

import java.util.Scanner;
class EnBuyuk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz : ");
        int birinci = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz :");
        int ikinci = scanner.nextInt();
        System.out.println("Üçüncü sayıyı giriniz :");
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
*/


/* 7 - Kullanıcıdan Alınan Cümlede Kaç Adet Boşluk Karakteri Olduğunu Bulan Java Kodu :

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz:");
        String cumle = scanner.nextLine();
        int boslukSayisi = 0;

        for (int i = 0; i < cumle.length(); i++) {
            // Eğer karakter bir boşluk ise, sayacı bir arttır
            if (cumle.charAt(i) == ' ') {
                boslukSayisi++;
            }
        }
        System.out.println("Cümledeki boşluk karakteri sayısı: " + boslukSayisi);
    }
}
*/


/* 8 - Kullanıcıdan Alınan Bir Kelimenin Palindrom Olup Olmadığını Kontrol Eden Java Kodu :


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrom olup olmadığını kontrol etmek istediğiniz kelimeyi giriniz:");
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
 */


/* 9 - Kullanıcıdan Alınan Cümlede Belirli Bir Kelimenin Kaç Kez Geçtiğini Hesaplayan Java Kodu :

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle giriniz :");
        String cumle = scanner.nextLine();

        System.out.println("Sayılmasını istediğiniz kelimeyi giriniz :");
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
*/


/* 10 - Bir Cümledeki Kelimeleri Tersten Sıralayarak Ekrana Yazdıran Java Kodu :

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz:");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");

        System.out.println("Girdiğiniz cümledeki kelimelerin ters sıralaması:");
        for (int i = kelimeler.length - 1; i >= 0; i--) {
            System.out.print(kelimeler[i] + " ");
        }
    }
}
*/


/* 11 - Bir Cümledeki Tüm Kelimelerin İlk Harfini Büyük Harfe Dönüştüren Java Kodu :

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz :");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");

        StringBuilder sonuc = new StringBuilder();
        for (int i = 0; i < kelimeler.length; i++) {
            String kelime = kelimeler[i];
            if (kelime.length() > 0) {
                String yeniKelime = kelime.substring(0, 1).toUpperCase() + kelime.substring(1).toLowerCase();
                sonuc.append(yeniKelime);
            }
            if (i < kelimeler.length - 1) {
                sonuc.append(" ");
            }
        }

        System.out.println("Değiştirilmiş cümle: " + sonuc.toString());
    }
}
 */


/* 12 - Bir Cümledeki En Uzun Kelimeyi Bulan Java Kodu :

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz:");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");

        String enUzunKelime = "";

        for (String kelime : kelimeler) {
            if (kelime.length() > enUzunKelime.length()) {
                enUzunKelime = kelime;
            }
        }

        System.out.println("Cümledeki en uzun kelime: " + enUzunKelime);
    }
}
 */


/* 13 - Bir Cümlede Geçen Her Kelimenin Uzunluğunu Hesaplayan Java Kodu :

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz :");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");

        for (String kelime : kelimeler) {
            System.out.println(kelime + ": " + kelime.length());
        }
    }
}
 */


/* 14 - Bir Kelimedeki Sesli ve Sessiz Harfleri Hesaplayan Java Kodu :

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz :");
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
*/
