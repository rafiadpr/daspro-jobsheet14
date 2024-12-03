
import java.util.Scanner;

public class Percobaan2_23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung : ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat : ");
        pangkat = sc.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));

        System.out.print("Deret perhitungan: ");
        System.out.println(hitungPangkat(bilangan, pangkat) + " = " + hasilPerhitungan(bilangan, pangkat));
    }

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    static int hasilPerhitungan(int x, int y) {
        if (y == 0) return 1;
        return x * hasilPerhitungan(x, y - 1);
    }
}
