import java.util.Scanner;

public class soal1sedang {
    
    public static long hitungFaktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int angka = scanner.nextInt();
        if (angka < 0) {
            System.out.println("Input harus bilangan bulat positif.");
        } else {
            long faktorial = hitungFaktorial(angka);
            System.out.println("Faktorial dari " + angka + " adalah: " + faktorial);
        }
    }
}
