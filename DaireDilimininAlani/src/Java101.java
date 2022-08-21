import java.util.Scanner;
public class Java101 {
    public static void main(String[] args) {

        double pi = 3.14, daireDilimininAlani;
        int r,a;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz : ");
        r = input.nextInt();

        System.out.print("Merkez Açısının Ölçüsünü Giriniz: ");
        a = input.nextInt();

        daireDilimininAlani = (pi * r * r * a/360);

        System.out.println("Daire Diliminin Alanı : " + daireDilimininAlani);

    }
}
