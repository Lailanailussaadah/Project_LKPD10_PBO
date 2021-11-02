/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Menu Aplikasi");
        
        System.out.println("Menu Aplikai Pythagoras");
        System.out.println("1. Cek triple pythagoras\n" +
                "2. Menentukan sisi miring segitiga\n" +
                "3. Menentukan sisi siku-siku segitiga\n"+
                "4. Exit");
        System.out.println("");
        Scanner masukan = new Scanner(System.in);
        
        switch(masukan.nextInt()){
            case 1:
                TriplePythagoras tp = new TriplePythagoras();
                tp.input();
                tp.cek();
                break;
                
            case 2:
                SisiMiring sm = new SisiMiring();
                sm.input();
                sm.sisiMiring();
                break;
                
            case 3:
                SisiSikuSiku sk = new SisiSikuSiku();
                sk.input();
                sk.sisiSikuSiku();
                break;
                
            case 4:
                System.out.println("Program Selesai");
                
                System.exit(0);
                
            default:
                System.out.println("Masukan tidak tersedia");
        }
    }
}
