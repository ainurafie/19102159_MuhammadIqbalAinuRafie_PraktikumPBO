package com.pbo.tugas1ganjilgenap;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ganjilgenap 
{
    public static void main( String[] args )
    {
        int angka;
            System.out.print("Masukkan Bilangan bulat: ");

        Scanner input = new Scanner(System.in);
             angka = input.nextInt();

        if (angka %2 == 0)
            System.out.println(angka + " merupakan Bilangan Genap!");
        else
            System.out.println(angka + " merupakan Bilangan Ganjil!");
    }
}
