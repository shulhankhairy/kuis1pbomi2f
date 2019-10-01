/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuissatupbo;

/**
 *
 * @author toshiba
 */
public class SepedaMotor {
    boolean motor;
    
    Mesin mesin = new Mesin();
    
    public void nyalakanMotor(){
        motor=true;
        mesin.nyalakanMesin();
    }
    
    public void matikanMotor(){
        motor = false;
        mesin.matikanMesin();
    }

    public boolean isMotor() {
        return motor;
    }

    
    
    
    
}
