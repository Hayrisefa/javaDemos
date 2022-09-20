import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] sayilar = new int[5];
        int sira;
        Scanner scanner = new Scanner(System.in);
        // for

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " .ci sayıyı giriniz ");
            int sayi = scanner.nextInt();


            sayilar[i] = sayi;
            System.out.println(sayi + " sayısı eklendi ");
        }
        System.out.println("---------------------------------");

        for (int a = 0; a < sayilar.length; a++) {
            if (sayilar[a] % 2 == 0) {
                int sayi2 = 0;

                for (int i = 0; i < 5; i++) {
                    for (int j = i + 1; j < 5; j++) {
                        if (sayilar[j] > sayilar[i]) {
                            sira = sayilar[i];
                            sayilar[i] = sayilar[j];
                            sayilar[j] = sira;
                        }
                    }

                }


            }
        }

        for (int i = 0; i < sayilar.length; i++) {
        System.out.println(" sayı" + sayilar[i]);

    }


}



