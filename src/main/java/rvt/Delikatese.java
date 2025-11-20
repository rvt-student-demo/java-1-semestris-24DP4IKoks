package rvt;
import java.util.Scanner;

public class Delikatese {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double endcena = 0.0;

        System.out.println("Ievadi preci: ");
        String prece = scanner.nextLine();

        System.out.println("Ievadi cenu: ");
        Double cena = Double.valueOf(scanner.nextLine());

        System.out.println("Ekspress piegade? Ja = 1, Ne = 0");
        Double piegade = Double.valueOf(scanner.nextLine());

        System.out.println("Jusu rekins");
        System.out.println(prece + " " + cena);

        if (cena < 10) {
            endcena += 2.0;
        if (piegade == 1) {
            endcena += 3.0;
            }
        }

        System.out.println("piegade" + " " + endcena);
        System.out.println("kopa" + " " + (cena + endcena));
    }
}