public class Main {
    public static void main(String[] args) {

        sayıBulmaca();

    }

    public static void sayıBulmaca() {

        int[] sayilar = new int[]{1, 2, 3, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer("Sayı mevcuttur : " + aranacak);
        } else {
            System.out.println("Sayı mevcuttur: " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        //methodlar camelcasing yazılırı
        System.out.println(mesaj);

    }

}