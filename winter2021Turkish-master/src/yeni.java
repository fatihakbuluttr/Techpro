import java.util.Locale;
import java.util.Scanner;

public class yeni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("isim girin: ");
        String r = scanner.next();
         char a= r.toUpperCase().charAt(0);
        String c= r.replace(r.charAt(0),a);



        System.out.println(c);
    }

    static double alanHesapla(double yariCap) {
        return 3.14 * yariCap * yariCap;
    }
}
