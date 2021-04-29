package com.nama.praktikumpbo.pertemuan2.unguided;

/**
 * Hello world!
 *
 */
public class chara 
{
    public static void main( String[] args )
    {
        deklarasi arrayChara[] = new deklarasi[3];
        
        deklarasi chara1 = new deklarasi();
        chara1.setNama("");
        chara1.setVision("");
        
        deklarasi chara2 = new deklarasi();
        chara2.setNama("Paimon");
        chara2.setVision("");
        
        deklarasi chara3 = new deklarasi(); 
        chara3.setNama("Tatang");
        chara3.setVision("Hydro");
        
        arrayChara[0] = chara1; 
        arrayChara[1] = chara2;
        arrayChara[2] = chara3;
        
        
        System.out.println("Daftar Nama Chara Cringe");
        for(deklarasi x : arrayChara) {
            System.out.println("Nama\t: "+ x.getNama());
            System.out.println("Vision\t: "+ x.getVision());
            System.out.println("");
        }
    }
}
