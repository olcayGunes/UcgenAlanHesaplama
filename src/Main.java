import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kenar1, kenar2, kenar3, cevre, alanKare,alan;

        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        kenar1 = input.nextDouble();

        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        kenar2 = input.nextDouble();

        System.out.print("3. Kenar Uzunluğunu Giriniz: ");
        kenar3 = input.nextDouble();

        cevre= kenar1+kenar2+kenar3;

        alanKare = ((cevre/2)*((cevre/2)-kenar1)*((cevre/2)-kenar2)*((cevre/2)-kenar3));
        alan = Math.sqrt(alanKare);
        System.out.println("Üçgenin Alanı: "+alan);
    }
}
