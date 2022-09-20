public class Main {
    public static void main(String[] args) {
        int sayi1 = 50;
        int sayi2 = 40;
        int sayi3 = 30;
        
        
        
        if (sayi1>sayi2){

            if (sayi1>sayi3){

                System.out.println("En büyük sayi : " + sayi1);

            }else {
                System.out.println("En büyük sayi : " + sayi2);
            }
            
        } else  {
            if (sayi2>sayi3){

                System.out.println("En büyük sayi : " + sayi2);

            }else {
                System.out.println("En büyük sayi : " + sayi3);
            }
            
        }


    }
}