/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author Lenovo
 */
public class MainKuis {
    public static void main(String[] args) {
        SepedaMotor sm1 = new SepedaMotor(0, false);
        Mesin m1 = new Mesin();
        
        sm1.printStatus();
        sm1.nyalakanMesin();
        m1.setJenis("Honda");
        m1.tampilMesin();
        sm1.printStatus();
        sm1.tambahKeceptan(10);
        sm1.kurangKecepatan(5);
        sm1.Max(100, 100);
        sm1.printStatus();
        sm1.matikanMesin();
        sm1.printStatus();
        
        m1.setJenis("Yamaha");
        m1.tampilMesin();
        sm1.nyalakanMesin();
        sm1.printStatus();
        sm1.tambahKeceptan(15);
        sm1.kurangKecepatan(10);
        sm1.Max(100, 100);
        sm1.printStatus();
        sm1.matikanMesin();
        sm1.printStatus();
        
        m1.setJenis("Suzuki");
        m1.tampilMesin();
        sm1.nyalakanMesin();
        sm1.printStatus();
        sm1.tambahKeceptan(25);
        sm1.tambahKeceptan(25);
        sm1.tambahKeceptan(25);
        sm1.tambahKeceptan(25);
        sm1.tambahKeceptan(25);
        sm1.kurangKecepatan(15);
        sm1.Max(100, 100);
        sm1.printStatus();
        sm1.matikanMesin();
        sm1.printStatus();
        
        m1.setJenis("Ducati");
        m1.tampilMesin();
        sm1.nyalakanMesin();
        sm1.printStatus();
        sm1.tambahKeceptan(50);
        sm1.tambahKeceptan(50);
        sm1.tambahKeceptan(50);
        sm1.tambahKeceptan(50);
        sm1.tambahKeceptan(50);
        sm1.kurangKecepatan(30);
        sm1.Max(200, 200);
        sm1.printStatus();
        sm1.matikanMesin();
        sm1.printStatus();
        
    }
}