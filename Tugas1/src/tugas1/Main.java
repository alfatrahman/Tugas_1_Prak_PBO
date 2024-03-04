/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author HP
 */
public class Main {
    
    public static void main(String[] args) {
        Ayam upi = new Ayam("Ayam", false);
        Ular piton = new Ular("Ular", false);
        
        upi.info();
        upi.bersuara();
        upi.jenis();
        upi.berkembangbiak();
        upi.makan();
        upi.bergerak();
        
        System.out.println();
        
        piton.info();
        piton.bersuara();
        piton.jenis();
        piton.berkembangbiak();
        piton.makan();
        piton.bergerak();
    }
}
