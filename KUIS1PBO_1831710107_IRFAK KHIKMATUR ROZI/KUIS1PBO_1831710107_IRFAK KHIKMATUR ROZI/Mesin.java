/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUIS;

/**
 *
 * @author USER
 */
public class Mesin {
    private String merek;
    private double kecepatan;
    public boolean kontakOn = false;

    public Mesin() {
    }
    
    public void nyalakanMesin() {
        kontakOn = true;
        System.out.println("=> Menyalakan Mesin");
        System.out.println("Mesin On");
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
        System.out.println("=> Mematikan Mesin");
        System.out.println("Mesin Off");
    }
    
    public void setMerek(String merekMesin) {
        this.merek = merekMesin;
    }

    public String getMerek() {
        return merek;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan() {
        if(kontakOn==true){
            if(merek=="Honda"){
                kecepatan+=10;
            }
            else if(merek=="Yamaha"){
                kecepatan+=15;
            }
            else if(merek=="Suzuki"){
                kecepatan+=25;
            }
            else if(merek=="Ducati"){
                kecepatan+=50;
            }
        }

    }

    public void kurangiKecepatan() {
        if(kontakOn==true){
            if(merek=="Honda"){
                kecepatan-=5;
            }
            else if(merek=="Yamaha"){
                kecepatan-=10;
            }
            else if(merek=="Suzuki"){
                kecepatan-=15;
            }
            else if(merek=="Ducati"){
                kecepatan-=30;
            }
        }
    }
}
