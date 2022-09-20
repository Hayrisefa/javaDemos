public class Main {
    public static void main(String[] args) {
        int number = 1;
        boolean remaninder = false;

        if (number == 1) {
            System.out.println("Sayi asal degildir.");
            return;
        }
        if (number < 1) {
            System.out.println("geçersiz sayi");
        }
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                remaninder = true;

            }
        }
        if (remaninder) {
            System.out.println(number + " Sayısı asaldeğildir");

        } else {
            System.out.println(number + " Sayısı asaldır");

        }


    }
}
