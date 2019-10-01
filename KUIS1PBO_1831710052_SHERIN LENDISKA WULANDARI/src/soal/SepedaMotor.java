/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal;

/**
 *
 * @author Sherin Lendiska Wulandari
 */
public class SepedaMotor {
    private Mesin mesin;
    private String merekMotor;

    public SepedaMotor() {
    }

    public SepedaMotor(String merekMotor, Mesin mesin) {
        this.merekMotor = merekMotor;
        this.mesin = mesin;
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public void setMerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }
    
    public void tambahKecepatanMotor(){
        this.mesin.tambahKecepatan();
    }
    public void kurangiKecepatanMotor(){
        this.mesin.kurangiKecepatan();
    }
   
    public void nyalakanMesin()
    {
        this.mesin.nyalakanMesin();
    }
    public void matikanMesin()
    {
        this.mesin.matikanMesin();
    }
     public void tampilData(){
        System.out.println("Merek Motor\t: "+merekMotor);
        this.mesin.printStatus();
            
    }
    
    
}
