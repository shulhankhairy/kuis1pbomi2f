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
public class KuisMain {
    public static void main(String[] args) {
        Mesin m1 = new Mesin("Honda");
        m1.nyalakanMesin();
        SepedaMotor spd1 = new SepedaMotor("Honda",m1);
        spd1.tambahKecepatan();
        spd1.kurangiKecepatan();
        spd1.status();
        spd1.tambahKecepatan();
        spd1.tambahKecepatan();
        spd1.tambahKecepatan();
        spd1.tambahKecepatan();
        spd1.tambahKecepatan();
        spd1.tambahKecepatan();
        spd1.tambahKecepatan();
        spd1.status();
        
         Mesin m2 = new Mesin("Yamaha");
         m2.nyalakanMesin();
         SepedaMotor spd2 = new SepedaMotor("Yamaha",m2);
        spd2.tambahKecepatan();
        spd2.kurangiKecepatan();
        spd2.status();
              
        Mesin m3 = new Mesin("Suzuki");
        m3.nyalakanMesin();
        SepedaMotor spd3 = new SepedaMotor("Suzuki",m3);
        spd3.tambahKecepatan();
        spd3.kurangiKecepatan();
        spd3.status();
        
        Mesin m4 = new Mesin("Ducati");
        m4.nyalakanMesin();
        SepedaMotor spd4 = new SepedaMotor("Ducati",m4);
        spd4.tambahKecepatan();
        spd4.kurangiKecepatan();
        spd4.status();
    }
}