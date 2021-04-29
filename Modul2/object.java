package com.iqbal.praktikumpbo.pertemuan2.guided;

/**
 * Hello world!
 *
 */
public class object {
    public static void main(String[] args) {
       mahasiswa mahasiswaTanpa = new mahasiswa();
       mahasiswaTanpa.setNama("Muhammad Iqbal Ainu Rafie");
       mahasiswaTanpa.setNim(19102159);
       
       System.out.println("Mahasiswa 1");
       System.out.println("Nama\t: "+ mahasiswaTanpa.getNama());
       System.out.println("Nim\t: "+ mahasiswaTanpa.getNim());
       
       mahasiswa mahasiswa = new mahasiswa("Sophia Deo Sandeva", 19102300);
       
       System.out.println("Mahasiswa 2");
       System.out.println("Nama\t: "+ mahasiswa.getNama());
       System.out.println("Nim\t: "+ mahasiswa.getNim());
   } 
}
