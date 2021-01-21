package com.jasonImut;

import java.util.Scanner;

public class Main {
    //JENIS PRINT PADA JAVA
    /* public static void main(String[] args) {
        int a = 10, b= 20;
        double c = 20.9;
        String d="Aku dan Kamu";
        System.out.printf("ini adalah nilai %d \n", a );
        System.out.printf("ini adalah nilai %f \n", c);
        System.out.printf("Kalimat ini berbunyi %s", d);

    } */
    //TIPE DATA DAN BATAS NYA
    /*public static void main(String[] args) {
        System.out.println("ini adalah batas max integer = " + Integer.MAX_VALUE);
        System.out.println("ini adalah batas min integer = " + Integer.MIN_VALUE);
        System.out.println("Jumlah bytes integer = " + Integer.BYTES);
        System.out.println("Jumlah bit integer = " + Integer.SIZE);

    } */
    //OPERATOR UNARY
    /* public static void main(String[] args) {
        int a= 1;
        System.out.printf("unary + dari %d menjadi %d \n",a, +a);
        System.out.printf("uanry - dari %d menjadi %d \n",a, -a);
    } */
    //UNARY INCREMENT ATAU DECREMENT
    /*public static void main(String[] args) {
        int a = 10, b=10;
        ++a;
        System.out.printf("Hasil increment adalah %d \n", a);
        --b;
        System.out.printf("Hasil increment adalah %d \n", b);
        int c=10, d=10;
        System.out.printf("Hasil increment dari %d adalah %d \n",c,++c);


    } */
    // MERUBAH DESIMAL KE BINER
    public static void main(String[] args) {
        byte a= 10;
        String a_bits;
        a_bits=String.format("%8s", Integer.toBinaryString(a)).replace(" ","0");
        System.out.printf("%s = %d \n", a_bits, a);
        byte b= 16;
        String b_bits;
        b_bits=String.format("%8s", Integer.toBinaryString(b)).replace(" ","0");
        System.out.printf("Desimal %d menjadi Biner %s \n",b, b_bits);
        int c = 1128;
        String c_bits;
        c_bits = String.format("%11s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("Desimal %d menjadi %s \n", c, c_bits);
        int d = 1980;
        String d_bits;
        d_bits = String.format("%11s", Integer.toBinaryString(d)).replace(" ", "0");
        System.out.printf("Desimal %d menajdi %s", d, d_bits);
    }
}
