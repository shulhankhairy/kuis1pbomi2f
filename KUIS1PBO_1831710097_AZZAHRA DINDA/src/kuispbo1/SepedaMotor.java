/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispbo1;

/**
 *
 * @author Azzahra Dinda S
 */
public class SepedaMotor {
    private String merk;
    private boolean motorMenyala = false;
    Mesin mesinMotor;

    public SepedaMotor() {
    }

    public SepedaMotor(String merk) {
        this.merk = merk;
        mesinMotor = new Mesin(merk);
    }

    public String getMerk() {
        return merk;
    }
    
    public void setMotorOn() {
        this.motorMenyala = true;
        if(isMotorMenyala()){
            mesinMotor.setMesinOn();
        }
    }
    
    public void setMotorOff(){
        mesinMotor.setMesinOff();
        this.motorMenyala = false;
    }
    
    public void tambahKecepatan(){
        mesinMotor.tambahKecepatan(this.merk);
    }
    
    public void kurangKecepatan(){
        mesinMotor.kurangiKecepatan(this.merk);
    }
    
    public boolean isMotorMenyala() {
        return motorMenyala;
    }
    
    public void printInfo(){
        System.out.println("Motor Menyala : " + this.motorMenyala);
        mesinMotor.printInfoMesin();
    }
    
    public void printKecepatan(){
        mesinMotor.printKecepatan();
    }
    
}
