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
class SisiMiring {
    int a;
    int b;
    double c = 0;
    
    void input(){
        System.out.println("Menentukan sisi miring segitiga");
        
        Scanner data = new Scanner(System.in);
        
        while(true){
            System.out.println("Masukkan nilai a :");
            a = data.nextInt();
            
            System.out.println("Masukkan nilai b :");
            b = data.nextInt();
            break;
        }
    }
    
    void sisiMiring(){
        this.c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Sisi miring c adalah :" + c);
    }
}
