package com.iqbal.praktikumpbo.pertemuan1.guided;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class DemoIf 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bil = input.nextInt();

        if(bil>0)
            System.out.println(bil + " adalah bilangan positif!");
        else if(bil<0)
            System.out.println(bil + " adalah bilangan negatif!");
        else
            System.out.println(bil + " adalah bilangan nol!");
        
    }
}
