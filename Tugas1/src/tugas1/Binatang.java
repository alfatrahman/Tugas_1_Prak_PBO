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
public abstract class Binatang {
    protected String nama;
    protected int jumlahKaki;
    protected boolean bisaTerbang;
   

    public Binatang(String nama, int jumlahKaki, boolean bisaTerbang) {
        this.nama = nama;
        this.jumlahKaki = jumlahKaki;
        this.bisaTerbang = bisaTerbang;
    }

    abstract void bersuara();
    abstract void jenis();

    public void info() {
        System.out.println("Nama    : " + nama);
        System.out.println("Jumlah Kaki : " + jumlahKaki);
        if(bisaTerbang){
            System.out.println("Bisa terbang    : Ya");
        }else
            System.out.println("Bisa terbang    : Tidak");
    }

}
