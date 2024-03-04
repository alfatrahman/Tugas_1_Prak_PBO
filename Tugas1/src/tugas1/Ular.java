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
public class Ular extends Binatang implements Aktivitas {
    Ular(String nama, boolean bisaTerbang){
        super(nama, 0, false);
    }
    
    @Override
    public void bersuara(){
        System.out.println( nama + " menghasilkan suara gemerisik atau mendesis");
    }
    
    @Override
     public void jenis(){
         System.out.println("Jenis : Reptil");
     }
     
    @Override
     public void berkembangbiak(){
         System.out.println(nama + " berkembang biak melalui proses ovipar (bertelur) dan vivipar (beranak)");
     }
    @Override
    public void makan(){
        System.out.println(nama + " biasanya menelan bulat-bulat mangsanya");
    }
    @Override
    public void bergerak(){
        System.out.println(nama + " merayap di permukaan tanah atau di atas permukaan datar");
    }
}
