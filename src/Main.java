import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int kenar1, kenar2, kenar3;
        double u, alan;
        System.out.print("Lütfen 1.kenarı girin : ");
        kenar1 = inp.nextInt();

        System.out.print("Lütfen 2.kenarı girin : ");
        kenar2 = inp.nextInt();

        System.out.print("Lütfen 3.kenarı girin : ");
        kenar3 = inp.nextInt();

        u = (kenar1 + kenar2 + kenar3) / 2;
        alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

        System.out.print("Üçgenin alanı : " + alan);
    }
}