import java.util.Scanner;
public class Java101 {
    public static void main(String[] args) {
        double kdvOrani, kdvTutari, kdvliTutar, kdvOrani1, kdvOrani2;
        double tutar;
        kdvOrani1 = 0.18;
        kdvOrani2 = 0.08;

        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Tutarı Giriniz: ");
        tutar = input.nextDouble();

        kdvOrani = tutar >= 1000.00 ? kdvOrani2 : kdvOrani1;

        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("KDV tutarı :" + kdvTutari);
        System.out.println("KDV'li Tutar: " + kdvliTutar + "TL");




    }
}
