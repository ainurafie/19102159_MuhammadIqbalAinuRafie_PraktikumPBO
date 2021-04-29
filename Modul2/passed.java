package com.nama.praktikumpbo.pertemuan2.guided;

/**
 * Hello world!
 *
 */
public class passed 
{
    public static void main( String[] args )
    {
        int nomer1, nomer2;
        
        TestPass pass = new TestPass(50, 100);
        nomer1 = 10;
        nomer2 = 20;
        
        System.out.println("Nilai Sebelum Passed by Value\t: ");
        System.out.println("Nomer1\t :"+ nomer1);
        System.out.println("Nomer2\t :"+ nomer2);
        
        pass.calculate(nomer1, nomer2);
        System.out.println("Nilai Setelah Passed by Value\t: ");
        System.out.println("Nomer1\t :"+ nomer1);
        System.out.println("Nomer2\t :"+ nomer2);
        System.out.println("");
        
        System.out.println("Nilai Sebelum Passed by Reference\t: ");
        System.out.println("Nomer1\t :"+pass.nomer1);
        System.out.println("Nomer2\t :"+pass.nomer2);
        
        pass.calculate(pass);
        System.out.println("Nilai Setelah Passed by Reference\t: ");
        System.out.println("Nomer1\t :"+pass.nomer1);
        System.out.println("Nomer2\t :"+pass.nomer2);
    }
}
