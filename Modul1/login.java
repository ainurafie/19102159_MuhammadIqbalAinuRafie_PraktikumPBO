package com.pbo.tugas1login;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class login 
{
    public static void main( String[] args )
    {
        int diskon =0, totalBelanja = 500000;
        if(totalBelanja >= 100000){
            diskon = totalBelanja/10;
        }
        System.out.println("Diskon = " + diskon);
    }
}