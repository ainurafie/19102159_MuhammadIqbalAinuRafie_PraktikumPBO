package com.iqbal.praktikumpbo.pertemuan1.guided;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==> Edit Profile <==");
        System.out.println("");

        System.out.print("Masukan nama : ");
        String nama = input.nextLine(); // String -> nextLine()

        System.out.print("Masukan inisial : ");
        char initial = input.nextLine().charAt(0); // char -> nextLine()

        System.out.print("Masukan usia : ");
        int usia = input.nextInt(); // int -> NextInt()

        System.out.print("Masukan tinggi badan : ");
        float tinggi = input.nextFloat(); // float -> nextFloat()

        System.out.println("");
        System.out.println("==> Profile Saya <==");
        System.out.println();
        System.out.println("Nama : " + nama);
        System.out.println("Inisial : " + initial);
        System.out.println("Usia : " + usia + " tahun");
        System.out.println("Nama : " + tinggi + " cm");
    }
}
