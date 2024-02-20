/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Kompuer B

Soal 2 Nim Genap
Buatlah algoritma dalam Bahasa Java Anda akan nikah jika uang tabungan > 100jt dan
sudah punya calon pasangan, yang dapat ditulis sebagai ekspresi: (tabungan > 100jt) &&
(calonPasangan)
*/

package NimGenap;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tabungan Anda dalam jumlah juta rupiah : ");
        double tabungan = scanner.nextDouble();

        System.out.print("Sudah punya calon pasangan? (sudah/belum): ");
        String sudahPunyaCalon = scanner.next();

        boolean calonPasangan = sudahPunyaCalon.equalsIgnoreCase("sudah");
        boolean bisaMenikah = (tabungan > 100000000) && calonPasangan;

        if (bisaMenikah) {
            System.out.println("Selamat, sudah bisa menikah!");
        } else {
            System.out.println("Maaf, belum bisa menikah. Silahkan lebih giat menabung!");
        }
    }

}
