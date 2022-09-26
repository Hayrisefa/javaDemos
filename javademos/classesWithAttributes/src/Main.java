public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(20.00);
        product.setStocAmoun(3);
        product.setRenk("mavi");




        ProductManager productManager = new ProductManager();
        productManager.add(product);

     System.out.println(product.getKod());
    }
}