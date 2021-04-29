package com.iqbal.praktikumpbo.pertemuan3.unguided;

import java.util.Scanner;//package

/**
 * Hello world!
 *@author Muhammad Iqbal Ainu Rafie
 */
public class KonversiSatuan 
{
    public static void main( String[] args )
    {
        double angka; //variable
        Scanner input = new Scanner(System.in); //metode input
        boolean keepLooping = true;
        //looping do while
        do{
            //menu
            System.out.println("\t\t==>Menu<==\t\t");
            System.out.println("1. Kilometer");
            System.out.println("2. Hektometer");
            System.out.println("3. Dekameter");
            System.out.println("4. Meter");
            System.out.println("5. Desimeter");
            System.out.println("6. Centimeter");
            System.out.println("7. Milimeter");
            System.out.println("8. Keluar");
            System.out.print("Masukkan Menu : ");
            int pilihan = input.nextInt();

            // pilihan Menu
            switch (pilihan){
                case 1: //menu kilometer
                    System.out.print("\tMasukkan Panjang Dalam Satuan Kilometer\t : ");
                    angka = input.nextDouble(); // input
                    //deklarasi object dengan parameter
                    Satuan satuan1 = new Satuan(angka);
                    System.out.println("\tPanjang Dalam Kilometer\t\t : " + satuan1.getAngka());
                    satuan1.kilometer(angka); //memanggil fungsi kilometer
                    break;
            
                case 2: //menu hektometer
                    System.out.print("\tMasukkan Panjang Dalam Satuan Hektometer\t : ");
                    angka = input.nextDouble(); //input
                    //deklarasi object dengan parameter
                    Satuan satuan2 = new Satuan(angka);
                    System.out.println("\tPanjang Dalam Hektometer\t\t : " + satuan2.getAngka());
                    satuan2.hektometer(angka); //memanggil fungsi hektometer
                    break;

                case 3: //menu dekameter
                    System.out.print("\tMasukkan Panjang Dalam Satuan Dekameter\t : ");
                    angka = input.nextDouble();//input
                    //deklarasi object dengan parameter
                    Satuan satuan3 = new Satuan(angka);
                    System.out.println("\tPanjang Dalam Dekameter\t\t : " + satuan3.getAngka());
                    satuan3.dekameter(angka); //memanggil fungsi dekameter
                    break;

                case 4: //menu meter
                    System.out.print("\tMasukkan Panjang Dalam Satuan Meter\t : ");
                    angka = input.nextDouble();//input
                    //deklarasi object dengan parameter
                    Satuan satuan4 = new Satuan(angka);
                    System.out.println("\tPanjang Dalam Meter\t\t : " + satuan4.getAngka());
                    satuan4.meter(angka); //memanggil fungsi Meter
                    break;
        
                case 5: //menu desimeter
                    System.out.print("\tMasukkan Panjang Dalam Satuan Desimeter\t : ");
                    angka = input.nextDouble();//input
                    //deklarasi object dengan parameter
                    Satuan satuan5 = new Satuan(angka);
                    System.out.println("\tPanjang Dalam Desimeter\t\t : " + satuan5.getAngka());
                    satuan5.desimeter(angka); //memanggil fungsi Desimeter
                    break;

                case 6: //menu centimeter
                    System.out.print("\tMasukkan Panjang Dalam Satuan Centimeter\t : ");
                    angka = input.nextDouble();//input
                    //deklarasi object dengan parameter
                    Satuan satuan6 = new Satuan(angka);
                    System.out.println("\tPanjang Dalam Centimeter\t\t : " + satuan6.getAngka());
                    satuan6.centimeter(angka); //memanggil fungsi Centimeter
                    break;
                
                case 7: //menu milimeter
                    System.out.print("\tMasukkan Panjang Dalam Satuan Milimeter\t : ");
                    angka = input.nextDouble();//input
                    //deklarasi object dengan parameter
                    Satuan satuan7 = new Satuan(angka);
                    System.out.println("\tPanjang Dalam Milimeter\t\t : " + satuan7.getAngka());
                    satuan7.milimeter(angka); //memanggil fungsi Milimeter
                    break;

                case 8: //menu keluar
                    System.out.println("\t= Terima kasih=\t");
                    keepLooping = false;// berhenti looping
                    break;
                
                default: //inputan salah
                    System.out.println("Inputan Salah!");
                    System.out.println();
              
            } 
        }while (keepLooping);
    }
}
