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
class TriplePythagoras {
    int a;
    int b;
    int c;
    
    void input(){
        System.out.println("Cek triple pythagoras");
        Scanner data = new Scanner(System.in);

        System.out.println("Masukan nilai a : ");
        a = data.nextInt();
  
        System.out.println("Masukan nilai b : ");
        b = data.nextInt();

        System.out.println("Masukan nilai c : ");
        c = data.nextInt();
     }   
        
    void cek(){
        int f = a*a;
        int e = b*b;
        int d = c*c;
        int g = e+f;
        
        if (d==g){
            System.out.println("Nilai " + a + ", " + b + ", " + c + "triple pythagoras");
        } else{
            System.out.println("Nilai " + a + ", " + b + ", " + c + "bukan triple pythagoras");
        }
    }
}
