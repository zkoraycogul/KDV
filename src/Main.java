import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        double fiyat,kdvliFiyat,kdvTutari;

        System.out.print("Fiyati giriniz : ");
        fiyat = girdi.nextDouble();


        System.out.println("Fiyat : " + fiyat);
        System.out.println("KDV'li fiyat : " + (fiyat>999?fiyat*1.08:fiyat*1.18));
        System.out.println("KDV Tutarı : " + (fiyat>999?fiyat*0.08:fiyat*0.18));
    }
}
