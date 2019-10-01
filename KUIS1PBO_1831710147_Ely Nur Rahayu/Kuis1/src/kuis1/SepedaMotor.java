/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author Ely Nur Rahayu
 */
public class SepedaMotor {
    private Mesin mesin;
    private String merk;
    private String warna;

    public SepedaMotor(Mesin mesin, String merk, String warna) {
        this.mesin = mesin;
        this.merk = merk;
        this.warna = warna;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public void tambahKecepatanMotor(){
        this.mesin.tambahKecepatan();
    }
    
    public void kurangiKecepatanMotor(){
        this.mesin.kurangiKecepatan();
    }

    public void nyalakanMesin(){
        this.mesin.nyalakanMesin();
    }
    
    public void matikanMesin(){
        this.mesin.matikanMesin();
    }
    
     public void tampilData(){
         System.out.println("-----------------------------");
        System.out.println("Merek Motor\t: "+merk);
        System.out.println("Warna Motor\t: " + warna);
        this.mesin.tampilData();
    }
}
