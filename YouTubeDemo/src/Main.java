public class Main {
    public static void main(String[] args) {
    /*    System.out.println("Hello world!");


        int sayı1 = 10;
        int sayi2 = 30;

        sayı1=sayi2;

        sayi2=100;
        System.out.println(sayı1);

        int [] sayilar1 = new int[]{1,2,3};
        int [] sayilar2 = new int[]{10,20,30};
       sayilar1 = sayilar2;
        sayilar2[0] = 10000;

        System.out.println(sayilar1[0]);
        System.out.println("---------------------------------------------------------------");
        CreditManager creditManager = new CreditManager();

        creditManager.Calculate();
        creditManager.Calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.Id = 1;
       // customer.FirstName="Hayri";
       // customer.LastName="Aydın";
        customer.City="Ankara";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Compay compay = new Compay();

        compay.TaxNumber= "1234412412";
        compay.CompanyName="Arçelik";
        compay.Id = 100;
        Customer c1 =new Customer();
        Customer c2 =new Compay();
        Customer c3 =new Person()
        Person person = new Person();*/

        CustomerManager customerManager = new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.GiveCredit();

    }

}