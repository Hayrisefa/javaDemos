public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.add();
        customerManager.update();
        customerManager.remove();

        int sayı1 = 10;
        int sayı2 = 20;
        sayı2 = sayı1;
        sayı1 = 30;
        System.out.println(sayı2);

        int [] sayilar1= new int[]{1,2,3};
        int [] sayilar2= new int[]{4,5,6};

        sayilar2 = sayilar1;
        sayilar1[0] = 10 ;

        System.out.println(sayilar2);

    }
}
