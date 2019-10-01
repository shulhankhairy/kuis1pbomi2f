/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quis1;

/**
 *
 * @author Anindya Ref
 */
public class SepedaMotor {
    private boolean motor = false;
    Mesin mesin;

    public SepedaMotor(String merek) {
        mesin = new Mesin(merek);
    }
   
    public void nyalakanMotor(){
       this.motor = true;        
       mesin.nyalakanMesin();
    }
    public void motorOff(){
        this.motor = false;
        mesin.mesinOff();
    }
    public boolean motorNyala(){
        return motor;
    }
    public double getKecepatan(){
        return mesin.getKecepatan();
    }
    public void tambahKecepatan(){
        mesin.tambahKecepatan();
    }
    public void kurangiKecepatan(){
        mesin.kurangiKecepatan();
    }
    public void info(){
        mesin.info();
    }
    public void printStatus(){
        mesin.printStatus();
    }
//        Mesin motor = new Mesin("Honda");
//        System.out.println("Merek SepedaMotor: "+motor.getMerek());
//        motor.nyalanMotor();
//        motor.nyalakanMesin();
        
    
}
