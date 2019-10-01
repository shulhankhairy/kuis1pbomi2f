/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author windows x
 */
public class SepedaMtr {
    private Mesin mesin = new Mesin();
    private String merekMotor;
  
    SepedaMtr(String merekMotor, String jenisMesin, Mesin mesin){
        this.merekMotor = merekMotor;
        mesin.setJenis(jenisMesin);
        this.mesin = mesin;
    }
    
    public void setMerekMotor(String merekMotor){
        this.merekMotor = merekMotor;
    }
    public String getMerekMotor(){
        return merekMotor;
    }
    public String getJenisMesin(){
        return mesin.getJenis();
    }
    public void tambahKecepatanMotor(){
        mesin.tambahKecepatan();
        System.out.println("Tambah kecepatan : "+ mesin.getKecepatan()+"km/jam");
    }
     public void kurangKecepatanMotor(){
        mesin.kurangKecepatan();
        System.out.println("Kurang kecepatan : "+ mesin.getKecepatan()+"km/jam");
    }
    public void cetakStatus(){
        System.out.println("Merk  :  " + merekMotor);
        mesin.printStatus();
    }
    
          
}
