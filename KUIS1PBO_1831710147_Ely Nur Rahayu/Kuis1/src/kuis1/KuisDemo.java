/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author Ely Nur Rahayu
 */
public class KuisDemo {
    public static void main(String[] args) {
        
        Mesin mesin1 = new Mesin("Honda");
        Mesin mesin2 = new Mesin("Yamaha");
        Mesin mesin3 = new Mesin("Suzuki");
        Mesin mesin4 = new Mesin("Ducati");
        
        
        SepedaMotor spd1 = new SepedaMotor(mesin1,"Beat", "merah");
        SepedaMotor spd2 = new SepedaMotor(mesin2,"Vario", "putih");
        SepedaMotor spd3 = new SepedaMotor(mesin3, "Nmax", "hitam");
   
        System.out.println("===================================");
        System.out.println("           SEPEDA MOTOR           ");
        System.out.println("==================================");
        spd1.nyalakanMesin();
        spd1.tambahKecepatanMotor();
        spd1.tambahKecepatanMotor();
        spd1.tambahKecepatanMotor();
        spd1.tambahKecepatanMotor();
        spd1.tambahKecepatanMotor();
        spd1.tambahKecepatanMotor();
        spd1.tambahKecepatanMotor();
        spd1.tambahKecepatanMotor();
        spd1.tambahKecepatanMotor();
        spd1.tambahKecepatanMotor();
        spd1.tambahKecepatanMotor();
        spd1.tampilData();
        
        spd2.nyalakanMesin();
        spd2.tambahKecepatanMotor();
        spd2.tambahKecepatanMotor();
        spd2.tampilData();
        
        spd3.nyalakanMesin();
        spd3.tambahKecepatanMotor();
        spd3.tambahKecepatanMotor();
        spd3.tambahKecepatanMotor();
        spd3.tampilData();
        
    }
}
