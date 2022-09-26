public class Main {
    public static void main(String[] args) {
        //oop obje orianted preject
        String mesaj = "Vade oranı";

        Product product1 = new Product();
        //Set işlemi atama yapıldı
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscont(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("bilmemne.jpg");

        // get işlemi
        // System.out.println(product1.name);

        Product product2 = new Product();
        //Set işlemi atama yapıldı
        product2.setName("Smeg  Kahve Makinesi");
        product2.setUnitPrice(7500);
        product2.setDiscont(7);
        product2.setUnitsInStock(3);
        product2.setImageUrl("bilmemne.jpg");

        Product product3 = new Product();
        //Set işlemi atama yapıldı
        product3.setName("Delonghi  Kahve Makinesi");
        product3.setUnitPrice(7500);
        product3.setDiscont(7);
        product3.setUnitsInStock(3);
        product3.setImageUrl("bilmemne.jpg");

        Product[] products ={product1,product2,product3};
        System.out.println("<ul>");
        for (Product prodcuts:products){
            System.out.println("<li>" + prodcuts.getName() + "</li>");

        }
            System.out.println("</ul>");

    IndividalCustoer individalCustoer = new IndividalCustoer();
    individalCustoer.setId(1);
    individalCustoer.setPhone("5352615785");
    individalCustoer.setCustomerNumber("1234");
    individalCustoer.setFirstName("Hayri");
    individalCustoer.setLastName("Aydin");

    CorporateCustomer corporateCustomer = new CorporateCustomer();
    corporateCustomer.setId(2);
    corporateCustomer.setPhone("535226547");
    corporateCustomer.setCustomerNumber("123123123");
    corporateCustomer.setCompanyName("Aydın holding");
    corporateCustomer.setTaxNumber("123123123");

    Customer[] customers ={corporateCustomer,individalCustoer};


    }
}