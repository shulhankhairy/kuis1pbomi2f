/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author windows x
 */
public class main {
    public static void main(String[] args) {
        Mesin ms1 = new Mesin();
        SepedaMtr s1 = new SepedaMtr("Vario","Honda", ms1);
        System.out.println("---------------------------------");
        ms1.nyalakanMesin();
        s1.tambahKecepatanMotor();
        s1.tambahKecepatanMotor();
        s1.kurangKecepatanMotor();
        s1.cetakStatus();
        
        Mesin ms2 = new Mesin();
        SepedaMtr s2 = new SepedaMtr("Mio","Yamaha", ms1);
       System.out.println("---------------------------------");
        ms2.nyalakanMesin();
        s2.tambahKecepatanMotor();
        s2.tambahKecepatanMotor();
        s2.kurangKecepatanMotor();
        s2.cetakStatus();
        
        
        
        
        Mesin ms3 = new Mesin();
        SepedaMtr s3 = new SepedaMtr("Sogun","Suzuki",ms1);
        System.out.println("---------------------------------");
        ms3.nyalakanMesin();
        s3.tambahKecepatanMotor();
        s3.tambahKecepatanMotor();
        s3.kurangKecepatanMotor();
        s3.cetakStatus();
       
        
        Mesin ms4 = new Mesin();
        SepedaMtr s4 = new SepedaMtr("motor","Ducati",ms1);
        System.out.println("---------------------------------");
        ms4.nyalakanMesin();
        s4.tambahKecepatanMotor();
        s4.tambahKecepatanMotor();
        s4.kurangKecepatanMotor();
        s4.cetakStatus();
       
       
    }
}
