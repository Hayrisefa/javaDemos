public class Main {
    public static void main(String[] args) {

        double[] myList = {1.2, 1.3, 4, 2, 5.6};
        double total = 0;
        double max = myList[0];

        for (double sayı : myList) {
            if (max < sayı) {

                max = sayı;
            }

            total = total + sayı;


        }
        System.out.println("Toplam " + total);
        System.out.println("En büyük  " + max);

    }
}