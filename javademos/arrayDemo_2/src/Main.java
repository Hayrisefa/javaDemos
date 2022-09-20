public class Main {

    public static void main(String[] args) {
        System.out.println("Ahmet");
        System.out.println("Engin");
        System.out.println("Hayri");
        System.out.println("Yesim");

        System.out.println("---------------------------------------");

        String[] ogrenci = new String[4];
        ogrenci[0] = "Ahmet";
        ogrenci[1] = "Engin";
        ogrenci[2] = "Hayri";
        ogrenci[3] = "Yesim";


        for (int i = 0; i < ogrenci.length; i++) {
            System.out.println(ogrenci[i]);

        }
        System.out.println("---------------------------------------");

        for (String ogrenciler:ogrenci) {

            System.out.println(ogrenciler);
        }

    }
}
