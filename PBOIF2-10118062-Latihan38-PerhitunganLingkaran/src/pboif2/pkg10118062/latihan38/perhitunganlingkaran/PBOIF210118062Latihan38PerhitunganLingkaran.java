/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PBOIF210118062Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setDiameter(inputDiameter());
        lingkaran.hitungLingkaran();
    }
    
    
    /**
     * Fungsi untuk input diameter
     * 
     * @return integer
     */
    public static int inputDiameter() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("======Perhitungan Lingkaran======");
        
        boolean looped = false;
        
        do {
            if(looped) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                scanner.nextLine();
           }
            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            
            looped = true;
        } while(!scanner.hasNextInt());
        
        return scanner.nextInt();
    }
    
}
