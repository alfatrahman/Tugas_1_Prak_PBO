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
public class Ayam extends Binatang implements Aktivitas {
    
    Ayam(String nama, boolean bisaTerbang){
        super(nama, 2, false);
    }
    
    @Override
    public void bersuara(){
        System.out.println( nama + " bersuara dengan jenis kicauan");
    }
    
    @Override
     public void jenis(){
         System.out.println("Jenis : Unggas atau burung");
     }
     
    @Override
     public void berkembangbiak(){
         System.out.println(nama + " berkembang biak melalui proses reproduksi seksual");
     }
    @Override
    public void makan(){
        System.out.println(nama + " biasanya makan dengan menggunakan paruh mereka");
    }
    @Override
    public void bergerak(){
        System.out.println(nama + " berjalan dengan kedua kaki mereka dengan langkah yang singkat dan cepat");
    }
     
}
