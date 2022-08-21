import java.util.Scanner;
public class Java101 {
    public static void main(String[] args) {
        double a, b, c, u, cevre, alan;

        Scanner input = new Scanner(System.in);
        System.out.print(" 1. kenarı giriniz : ");
        a = input.nextDouble();

        System.out.print(" 2. kenarı giriniz : ");
        b = input.nextDouble();

        System.out.print(" 3. kenarı giriniz : ");
        c = input.nextDouble();

        u = (a + b + c) / 2;

        cevre = 2 * u;

        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("üçgenin çevresi : " + cevre);

        System.out.println("üçgenin alanı : " + alan);




    }
}
