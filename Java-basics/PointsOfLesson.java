// Girilen Nota Göre Dersten Geçme-Kalma Durumunu Hesaplayan Java Kodu :

import java.util.Scanner;

public class PointsOfLesson {
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
