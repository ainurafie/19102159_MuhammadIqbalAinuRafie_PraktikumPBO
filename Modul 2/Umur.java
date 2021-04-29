package com.nama.praktikumpbo.pertemuan2.unguided;

import java.util.Scanner;

public class Umur 
{
    public static void main( String[] args )
    {
        int year;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun Lahir : ");
        year = input.nextInt(); //Inputan tahun
        
        int age = 2021 - year; 
        System.out.println("Umur Kamu Adalah : "+ age);
    }
    
}