public class Product {

    public Product () {
        System.out.println("Yapıcı blok çalıştı.");
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStocAmoun() {
        return stocAmoun;
    }

    public void setStocAmoun(int stocAmoun) {
        this.stocAmoun = stocAmoun;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        this.kod = name.substring(0, 1) + id;
        return kod;
    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stocAmoun;
    private String renk;
    private String kod;
}
