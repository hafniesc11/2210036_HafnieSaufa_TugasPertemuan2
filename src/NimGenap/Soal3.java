/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Kompuer B

Soal 3 Nim Genap
Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter ‘X’ dan
karakter ‘y’!
*/

package NimGenap;

import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan karakter 'X': ");
        char X = scanner.next().charAt(0);

        System.out.print("Masukkan karakter 'y': ");
        char y = scanner.next().charAt(0);

        int asciiX = (int) X;
        int asciiY = (int) y;

        int jumlah = asciiX + asciiY;

        System.out.println("Hasil penjumlahan ASCII dari karakter 'X' dan 'y' adalah: " + jumlah);
    }
}

