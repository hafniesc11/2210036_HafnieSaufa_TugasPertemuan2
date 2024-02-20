/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Kompuer B

Soal No 1 Nim Genap
Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan
pecahan negatif dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan!
*/

package NimGenap;

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan pecahan 1 (pembilang/penyebut): ");
        int pb1 = scanner.nextInt();
        int py1 = scanner.nextInt();
        
        System.out.print("Masukkan pecahan 2 (pembilang/penyebut): ");
        int pb2 = scanner.nextInt();
        int py2 = scanner.nextInt();
        
        System.out.print("Masukkan pecahan 3 (pembilang/penyebut): ");
        int pb3 = scanner.nextInt();
        int py3 = scanner.nextInt();
        
        double pecahan1 = (double) pb1/py1;
        double pecahan2 = (double) pb2/py2;
        double pecahan3 = (double) pb3/py3;
        
        System.out.println("Hasil Penjumlahan : " + (pecahan1 + pecahan2 + pecahan3));
        System.out.println("Hasil Pengurangan : " + (pecahan1 - pecahan2 - pecahan3));
        System.out.println("Hasil pengalian : " + (pecahan1 * pecahan2 * pecahan3));
        System.out.println("Hasil Pembagian : " + (pecahan1 / pecahan2 / pecahan3));
    }
    
}
