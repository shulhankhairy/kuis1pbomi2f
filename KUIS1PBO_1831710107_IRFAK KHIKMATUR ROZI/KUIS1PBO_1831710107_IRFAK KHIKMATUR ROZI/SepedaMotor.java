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
public class SepedaMotor {
    private Mesin mesin;
    private String merekMotor;

    public SepedaMotor(String merekMotor, Mesin merekMesin) {
        this.merekMotor = merekMotor;
        this.mesin = merekMesin;
    }

    public void setMerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public String getMerekMesin() {
        return mesin.getMerek();
    }
    
    public void tambahKecepatanMotor(){
        if(mesin.kontakOn==true){
            if (mesin.getKecepatan()>=100) {
                if(mesin.getMerek()=="Ducati"){
                    mesin.tambahKecepatan();
                    if(mesin.getKecepatan()>200){
                        System.out.println("=> Menambah Kecepatan");
                        System.out.println("Tidak Bisa menambah kecepatan karena kecepatan Max");
                    }
                    else{
                        System.out.println("=> Menambah Kecepatan");
                        System.out.println("Kecepatan saat ini "+mesin.getKecepatan()+" km/jam");
                    }
                }else{
                    System.out.println("=> Menambah Kecepatan");
                    System.out.println("Tidak Bisa menambah kecepatan karena kecepatan Max");
                }
            } 
            else {
                mesin.tambahKecepatan();
                System.out.println("=> Menambah Kecepatan");
                System.out.println("Kecepatan saat ini "+mesin.getKecepatan()+" km/jam");
            }
        }
        else{
            System.out.println("=> Menambah Kecepatan");
            System.out.println("Kecepatan tidak bisa bertambah sebab Mesin off");
        }
    }
    
    public void kurangiKecepatanMotor(){
        if(mesin.kontakOn==true){
            mesin.kurangiKecepatan();
            if (mesin.getKecepatan()<=0) {
                System.out.println("=> Mengurangi Kecepatan");
                System.out.println("Kecepatan min");
            } else {
                System.out.println("=> Mengurangi Kecepatan");
                System.out.println("Kecepatan saat ini "+mesin.getKecepatan()+" km/jam");
            }
        }
        else{
            System.out.println("=> Mengurangi Kecepatan");
            System.out.println("Kecepatan tidak bisa berkurang sebab Mesin off");
        }
    }
}
