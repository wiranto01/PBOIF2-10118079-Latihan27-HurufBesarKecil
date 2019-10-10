/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118079.latihan27.hurufbesarkecil;

/**
 *
 * @author user
 * Nama : Wiranto
 * Nim : 10118079
 * Kelas : IF-2
 */
import java.util.Scanner;
public class PBOIF210118079Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String huruf = scanner.next();

        String besar = huruf.toUpperCase();
        String kecil = huruf.toLowerCase();

        System.out.println();
        System.out.println("======Hasil Formating======");
        System.out.println("Huruf Besar : " + besar);
        System.out.println("Huruf kecil : " + kecil);
        System.out.println(" Develope By Wiranto");
    }
    
}
