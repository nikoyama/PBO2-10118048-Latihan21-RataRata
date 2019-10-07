/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung rata-rata nilai mahasiswa
 */
public class PBO210118048Latihan21RataRataNilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mahasiswa, i, nilai[];
        double total;

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa = scanner.nextInt();
        nilai = new int[mahasiswa];
        total = 0;
        for (i = 0;i < mahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = scanner.nextInt();
            total += nilai[i];
        }
        tampilHasil(total, mahasiswa);
    }
    
    public static void tampilHasil(double total, int mahasiswa) {
        hitungRataRata(total, mahasiswa);
        System.out.println("Delevoped by : Niko Yama");
    }
    
    public static double hitungRataRata(double total, int mahasiswa) {
        double rataRata = total / mahasiswa;
        System.out.printf("\nMaka, Rata-rata Nilainya adalah %.1f %n",rataRata);
        return rataRata;
    }
}