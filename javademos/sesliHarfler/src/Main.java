public class Main {
    public static void main(String[] args) {
        char harf = 'A';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Sesli kalın harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("Sesli ince harf");
            default:
                System.out.println("Sesli harf değil");
        }
    }
}