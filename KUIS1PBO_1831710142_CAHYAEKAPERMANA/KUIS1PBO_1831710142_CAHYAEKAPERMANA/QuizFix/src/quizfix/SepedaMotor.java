/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizfix;

/**
 *
 * @author Cahya Eka
 */
public class SepedaMotor{
    private String merekMotor;
    private Mesin mesin;

    public SepedaMotor(String merekMotor,  Mesin mesin) {
        this.merekMotor = merekMotor;
        this.mesin = mesin;
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public void setMerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
    public void tambahKecepatan(){
        mesin.tambahKecepatan();
    }
    public void kurangiKecepatan(){
        mesin.kurangiKecepatan();
    }
    public void printStatus(){
        System.out.println(merekMotor);
        mesin.printStatus();
        
    } 
}
