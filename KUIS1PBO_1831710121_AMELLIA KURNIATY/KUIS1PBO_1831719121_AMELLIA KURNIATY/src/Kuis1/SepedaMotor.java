/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1;

/**
 *
 * @author SAMSUNG
 */
public class SepedaMotor{
    private String jenisMotor;
    private Mesin mesin;

    public SepedaMotor(String jenisMotor,  Mesin mesin) {
        this.jenisMotor = jenisMotor;
        this.mesin = mesin;
    }
    public String getMerekMotor() {
        return jenisMotor;
    }
    public void setMerekMotor(String merekMotor) {
        this.jenisMotor = merekMotor;
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
    public void status(){
        System.out.println(jenisMotor);
        mesin.status();
    } 
}
