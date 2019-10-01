/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author Lenovo
 */
public class SepedaMotor {
    private int kecepatan;
    private boolean kontakOn;
    private Mesin mesin;

    public SepedaMotor(int kecepatan, boolean kontakOn) {
        this.kecepatan = 0;
        this.kontakOn = false;
    }

    public SepedaMotor(Mesin mesin) {
        this.mesin = mesin;
    }
    
    public void nyalakanMesin() {
        kontakOn = true;
    }
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKeceptan(int tambah) {
        if (kontakOn = true) {
            kecepatan += tambah;
            System.out.println("Kecepatan bertambah " +tambah+ " km/jam");
        }
        else {
            System.out.println("Mesin belum nyala!");
        }
    }
    
    public void kurangKecepatan(int kurang) {
        if (kontakOn = true) {
            kecepatan -= kurang;
            System.out.println("kecepatan berkurang " +kurang+ " km/jam");
        }
        else {
            System.out.println("Mesin belum nyala!");
        }
    }
    
    public void Max(int max, int speed) {
        if (kecepatan >= max) {
            kecepatan = speed;
            System.out.println("Kecepatan Maximum");
        }
    }
    
    public void printStatus() {
        if (kontakOn==true) {
            System.out.println("Kontak On");
        }
        else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " +kecepatan+ " \n");
        
    }
}
