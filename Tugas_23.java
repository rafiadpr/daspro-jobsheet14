
import java.util.Scanner;

public class Tugas_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang dihitung : ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];

        for (int i = jumlah; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            angka[i - 1] = input.nextInt();
        }

        System.out.println("Total Rekursif : " + hitungRekursif(angka, jumlah));
        System.out.println("Total Iteratif : " + hitungIteratif(angka));

    }

    static int hitungRekursif(int angka[], int n) {
        if (n == 0) {
            return 0;
        } else {
            return angka[n - 1] + hitungRekursif(angka, n - 1);
        }
    }

    static int hitungIteratif(int angka[]) {
        int hasil = 0;
        for (int i = 0; i < angka.length; i++) {
            hasil += angka[i];
        }
        return hasil;
    }
}
