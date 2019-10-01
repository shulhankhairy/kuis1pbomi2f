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
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Mesin m = new Mesin();
        m.setMesin("Honda");
        SepedaMotor honda = new SepedaMotor(m);
        System.out.println(honda.getMerekMesin());
        m.nyalakanMesin();
        m.printStatus();
        honda.tambahKecepatanMotor();
        honda.kurangiKecepatanMotor();
        
        System.out.println();
        Mesin m2 = new Mesin();
        m2.setMesin("Yamaha");
        SepedaMotor yamaha = new SepedaMotor(m2);
        System.out.println(yamaha.getMerekMesin());
        m2.nyalakanMesin();
        m2.printStatus();       
        yamaha.tambahKecepatanMotor();
        yamaha.tambahKecepatanMotor();
        yamaha.kurangiKecepatanMotor();
        
        System.out.println();
        Mesin m3 = new Mesin();
        m3.setMesin("Suzuki");
        SepedaMotor suzuki = new SepedaMotor(m3);
        System.out.println(suzuki.getMerekMesin());
        m3.nyalakanMesin();
        m3.printStatus();
        suzuki.tambahKecepatanMotor();
        suzuki.kurangiKecepatanMotor();
        
        System.out.println();
        Mesin m4 = new Mesin();
        m4.setMesin("Ducati");
        SepedaMotor ducati = new SepedaMotor(m4);
        System.out.println(ducati.getMerekMesin());
        m4.nyalakanMesin();
        m4.printStatus();       
        ducati.tambahKecepatanMotor();
        ducati.tambahKecepatanMotor();
        ducati.kurangiKecepatanMotor();
        
    }
    
}
