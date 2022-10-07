public class CustomerManager {
    private ICreditManager creditManager;
    private Customer customer;

    public CustomerManager(Customer customer,ICreditManager creditManager){

        this.customer = customer;
        this.creditManager=creditManager;
    }

    public void Save(){
        System.out.println("Müşteri kaydedildi : ");
       // System.out.println("Müşteri kaydedildi : " + this.customer.FirstName);
    }
    public void Delete(){
        System.out.println("Müşteri silindi  : ");
        //System.out.println("Müşteri silindi : " + this.customer.FirstName);
    }
    public void GiveCredit(){

    this.creditManager.Calculate();
        System.out.println("Kredi verildi  : " );
    }


}
