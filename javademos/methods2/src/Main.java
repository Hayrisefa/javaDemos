public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(5, 7);
        System.out.println(sayi);
        int topla = toplar(2, 3, 4, 5, 6);
        System.out.println(topla);

    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int toplar(int... sayılar) {
        int toplam = 0;
        for (int sayi : sayılar) {
            toplam = toplam + sayi;
        }
        return toplam;
    }


    public static String sehirVer() {
        return "Ankara";
    }
}