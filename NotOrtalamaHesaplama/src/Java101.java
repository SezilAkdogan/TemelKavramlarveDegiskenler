import java.util.Scanner;
public class Java101 {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        double average;


        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu girin : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu girin : ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu girin : ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu girin : ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu girin : ");
        muzik = input.nextInt();

        average =(mat + fizik + kimya + turkce + tarih + muzik)/6;
        System.out.println("Ortalamanız : " + average);

        String result = (average >= 60)?"Sınıfı Geçtiniz :)":"Sınıfta Kaldınız :( ";

        System.out.printf(result);

    }
}
