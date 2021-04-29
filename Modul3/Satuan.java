package com.iqbal.praktikumpbo.pertemuan3.unguided;

public class Satuan {
    //variable
    double kilometer = 0;
    double hektometer = 0;
    double dekameter = 0;
    double meter = 0;
    double desimeter = 0;
    double centimeter = 0;
    double milimeter = 0;
    double angka;
    //konstruktor 1 dengan parameter
    public Satuan(double angka){
        this.angka = angka;
    }
    //getter dan setter
    //method
    public double getAngka(){
        return angka;
    }
    //fungsi kilometer
    void kilometer(double angka){
        hektometer = (angka*10);
        dekameter = (angka*100);
        meter = (angka*1000);
        desimeter = (angka*10000);
        centimeter = (angka*100000);
        milimeter = (angka*1000000);
        System.out.println("\tSatuan dalam hektometer\t : " +hektometer+ "hm");
        System.out.println("\tSatuan dalam dekameter\t : " +dekameter+ "dam");
        System.out.println("\tSatuan dalam meter\t : " +meter+ "m");
        System.out.println("\tSatuan dalam desimeter\t : " +desimeter+ "dm");
        System.out.println("\tSatuan dalam centimeter\t : " +centimeter+ "cm");
        System.out.println("\tSatuan dalam milimeter\t : " +milimeter+ "mm");
        System.out.println("");
    }
    //fungsi hektometer
    void hektometer(double angka){
        kilometer = (angka/10);
        dekameter = (angka*10);
        meter = (angka*100);
        desimeter = (angka*1000);
        centimeter = (angka*10000);
        milimeter = (angka*100000);
        System.out.println("\tSatuan dalam kilometer\t : " +kilometer+ "km");
        System.out.println("\tSatuan dalam dekameter\t : " +dekameter+ "dam");
        System.out.println("\tSatuan dalam meter\t : " +meter+ "m");
        System.out.println("\tSatuan dalam desimeter\t : " +desimeter+ "dm");
        System.out.println("\tSatuan dalam centimeter\t : " +centimeter+ "cm");
        System.out.println("\tSatuan dalam milimeter\t : " +milimeter+ "mm");
        System.out.println("");
    }
    //fungsi dekatometer
    void dekameter(double angka){
        kilometer = (angka/100);
        hektometer = (angka/10);
        meter = (angka*10);
        desimeter = (angka*100);
        centimeter = (angka*1000);
        milimeter = (angka*10000);
        System.out.println("\tSatuan dalam kilometer\t : " +kilometer+ "km");
        System.out.println("\tSatuan dalam hektometer\t : " +hektometer+ "hm");
        System.out.println("\tSatuan dalam meter\t : " +meter+ "m");
        System.out.println("\tSatuan dalam desimeter\t : " +desimeter+ "dm");
        System.out.println("\tSatuan dalam centimeter\t : " +centimeter+ "cm");
        System.out.println("\tSatuan dalam milimeter\t : " +milimeter+ "mm");
        System.out.println("");
    }
    //fungsi meter
    void meter(double angka){
        kilometer = (angka/1000);
        hektometer = (angka/100);
        dekameter = (angka/10);
        desimeter = (angka*10);
        centimeter = (angka*100);
        milimeter = (angka*1000);
        System.out.println("\tSatuan dalam kilometer\t : " +kilometer+ "km");
        System.out.println("\tSatuan dalam hektometer\t : " +hektometer+ "hm");
        System.out.println("\tSatuan dalam dekameter\t : " +dekameter+ "dam");
        System.out.println("\tSatuan dalam desimeter\t : " +desimeter+ "dm");
        System.out.println("\tSatuan dalam centimeter\t : " +centimeter+ "cm");
        System.out.println("\tSatuan dalam milimeter\t : " +milimeter+ "mm");
        System.out.println("");
    }
    //fungsi desimeter
    void desimeter(double angka){
        kilometer = (angka/10000);
        hektometer = (angka/1000);
        dekameter = (angka/100);
        meter = (angka/10);
        centimeter = (angka*10);
        milimeter = (angka*100);
        System.out.println("\tSatuan dalam kilometer\t : " +kilometer+ "km");
        System.out.println("\tSatuan dalam hektometer\t : " +hektometer+ "hm");
        System.out.println("\tSatuan dalam dekameter\t : " +dekameter+ "dam");
        System.out.println("\tSatuan dalam meter\t : " +meter+ "m");
        System.out.println("\tSatuan dalam centimeter\t : " +centimeter+ "cm");
        System.out.println("\tSatuan dalam milimeter\t : " +milimeter+ "mm");
        System.out.println("");
    }
    //fungsi centimeter
    void centimeter(double angka){
        kilometer = (angka/100000);
        hektometer = (angka/10000);
        dekameter = (angka/1000);
        meter = (angka/100);
        desimeter = (angka/10);
        milimeter = (angka*10);
        System.out.println("\tSatuan dalam kilometer\t : " +kilometer+ "km");
        System.out.println("\tSatuan dalam hektometer\t : " +hektometer+ "hm");
        System.out.println("\tSatuan dalam dekameter\t : " +dekameter+ "dam");
        System.out.println("\tSatuan dalam meter\t : " +meter+ "m");
        System.out.println("\tSatuan dalam desimeter\t : " +desimeter+ "dm");
        System.out.println("\tSatuan dalam milimeter\t : " +milimeter+ "mm");
        System.out.println("");
    }
    //fungsi milimeter
    void milimeter(double angka){
        kilometer = (angka/1000000);
        hektometer = (angka/100000);
        dekameter = (angka/10000);
        meter = (angka/1000);
        desimeter = (angka/100);
        centimeter = (angka/10);
        System.out.println("\tSatuan dalam kilometer\t : " +kilometer+ "km");
        System.out.println("\tSatuan dalam hektometer\t : " +hektometer+ "hm");
        System.out.println("\tSatuan dalam dekameter\t : " +dekameter+ "dam");
        System.out.println("\tSatuan dalam meter\t : " +meter+ "m");
        System.out.println("\tSatuan dalam desimeter\t : " +desimeter+ "dm");
        System.out.println("\tSatuan dalam centimeter\t : " +centimeter+ "cm");
        System.out.println("");
    }
}
