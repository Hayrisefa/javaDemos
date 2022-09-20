public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i += 2) {
            System.out.println("Sayi : " + i);
        }
        System.out.println("For Döngü bitti");

        int i = 1;
        while (i < 10) {
            System.out.println("Sayi : " + i);
            i+=2;


        }
        System.out.println("While Döngüsü bitti");


        //do while
        int j = 1;
        do{
            System.out.println("Sayi : " + j);
            j+=2;

        }while (j < 10);

        System.out.println("Do-While Döngüsü bitti");

    }
}