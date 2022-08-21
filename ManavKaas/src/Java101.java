import java.io.SequenceInputStream;
import java.util.Scanner;
public class Java101 {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplamTutar;
        double aFiyat, eFiyat, dFiyat, mFiyat, pFiyat;

        aFiyat = 2.14;
        eFiyat = 3.67;
        dFiyat = 1.11;
        mFiyat = 0.95;
        pFiyat = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kilo Armut aldınız ? : ");
        armut = input.nextDouble();

        System.out.print("Kaç kilo Elma aldınız ? : ");
        elma = input.nextDouble();

        System.out.print("Kaç kilo Domates aldınız ? : ");
        domates = input.nextDouble();

        System.out.print("Kaç kilo Muz aldınız ? : ");
        muz = input.nextDouble();

        System.out.print("Kaç kilo Patlıcan aldınız ? : ");
        patlican = input.nextDouble();

        toplamTutar = (armut*aFiyat) + (elma*eFiyat) + (domates*dFiyat) + (muz*mFiyat) + (patlican*pFiyat);
        System.out.println("Toplam Tutar: " + toplamTutar + " TL ");


    }
}
