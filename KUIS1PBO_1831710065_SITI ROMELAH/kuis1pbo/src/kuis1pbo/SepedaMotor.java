/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kuis1pbo;

/**
 *
 * @author DELL
 */
public class SepedaMotor {
    private Mesin mesin;
    
    public SepedaMotor (Mesin mesin){
        this.mesin = mesin;
    }

    public String getMerekMesin() {
        return mesin.getMerek();
    }

    public void tambahKecepatanMotor(){
        this.mesin.tambahKecepatan();
    }
    public void kurangiKecepatanMotor(){
        this.mesin.kurangiKecepatan();
    }
}

