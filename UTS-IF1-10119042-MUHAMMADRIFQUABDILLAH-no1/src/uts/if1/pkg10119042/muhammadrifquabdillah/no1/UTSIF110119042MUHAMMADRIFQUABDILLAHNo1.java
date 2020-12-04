/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119042.muhammadrifquabdillah.no1;
import java.util.Scanner;

/**
 *
 * 
 * @author Muhammad Rifqu Abdillah
 * IF-1
 * 10119042
 */
public class UTSIF110119042MUHAMMADRIFQUABDILLAHNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Age umur = new Age(2020);
        
        System.out.println("Masukan Tahun Lahir Anda : ");
        umur.setYearBirth(scanner.nextInt());
        
        System.out.println();
        System.out.println("=====Hasil Perhitungan Umur=====");
        int yearBirth = umur.getYearBirth();
        System.out.println("Tahun lahir anda : "+ yearBirth);
        int yearNow = umur.getYearNow();
        System.out.println("Hari ini Tahun : "+ yearNow);
        int usia = umur.hitungUmur();
        System.out.println("Umur kamu sampai hari ini adalah " + usia + " tahun");
        System.out.println("Tandanya Kamu " + umur.tandanyaKamu(usia));
        
        
    }
    
}
