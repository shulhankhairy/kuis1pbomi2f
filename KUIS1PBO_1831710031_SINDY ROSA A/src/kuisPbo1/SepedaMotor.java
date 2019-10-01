/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisPbo1;

/**
 *
 * @author SINDY
 */
public class SepedaMotor {
    private Mesin mesin = new Mesin();
    private String merekMotor;
    private String merekMesin;
    private int kecepatan;
    
    SepedaMotor(String merekMotor, String merekMesin, Mesin mesin){
        this.merekMotor = merekMotor;
        mesin.setMerek(merekMesin);
        this.mesin = mesin;
    }
    public void setmerekMotor(String merekMotor){
      this.merekMotor = merekMotor;
    }
    public String getemerekMotor(){
      return merekMotor;
    }
    public String getemerekMesin(){
      return mesin.getMerek();
    }
    public void tambahKecepatanMotor(){
        mesin.tambahKecepatan();
        System.out.println("Tambah Kecepatan : " + mesin.getKecepatan()+ "km/jam");
    }
    public void kurangiKecepatanMotor(){
        mesin.kurangKecepatan();
        System.out.println("Kurangi Kecepatan : " + mesin.getKecepatan()+ "km/jam");
    }
    public void cetakStatusMotor(){
        mesin.cetakStatusMotor();
    }
}
