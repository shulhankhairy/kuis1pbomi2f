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
public class MainKuis {
     public static void main(String[] args) {
        
        //bentuk 4 objek mesin
        Mesin m1 = new Mesin("Honda");
        Mesin m2 = new Mesin("Yamaha");
        Mesin m3 = new Mesin("Suzuki");
        Mesin m4 = new Mesin("Ducati");
        
        //bentuk objek sepeda motor
        SepedaMotor spd1 = new SepedaMotor("Beat",m1);
        SepedaMotor spd2 = new SepedaMotor("Mio",m2);
        SepedaMotor spd3 = new SepedaMotor("Vega",m3);
        SepedaMotor spd4 = new SepedaMotor("MX",m4);
        
        
        spd1.nyalakanMesin();
        spd1.tambahKecepatanMotor();
        spd1.kurangiKecepatanMotor();
        spd1.tampilData();
        
        //contoh run kecepatan maximum
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
        spd2.kurangiKecepatanMotor();
        spd2.tampilData();
        
        spd3.nyalakanMesin();
        spd3.tambahKecepatanMotor();
        spd3.kurangiKecepatanMotor();
        spd3.tampilData();
        
        spd3.nyalakanMesin();
        spd3.tambahKecepatanMotor();
        spd3.kurangiKecepatanMotor();
        spd3.tampilData();
        
        
    
    }
}
