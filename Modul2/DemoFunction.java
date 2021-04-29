package com.iqbal.praktikumpbo.pertemuan2.guided;

public class DemoFunction 
{
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        drawTriangle(3);
        drawSquare(5,7);
        drawSquare(2,2);
    }

    public static void drawTriangle(int length){
        for (int row=1; row<=length; row++){
            for (int column=1; column <= row; column++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void drawSquare(int length, int widht){
        for(int row=1; row<=length; row++){
            for(int column=1; column <= widht; column++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
