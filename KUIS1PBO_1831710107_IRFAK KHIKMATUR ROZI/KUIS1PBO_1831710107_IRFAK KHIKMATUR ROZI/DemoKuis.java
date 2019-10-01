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
public class DemoKuis {
     public static void main(String[] args) {
        Mesin msn = new Mesin();
        msn.setMerek("Honda");
        SepedaMotor honda = new SepedaMotor("Honda", msn);
        System.out.println(honda.getMerekMotor());
        msn.nyalakanMesin();
        honda.tambahKecepatanMotor();
        honda.kurangiKecepatanMotor();
        honda.tambahKecepatanMotor();
        
        System.out.println();
        
        Mesin msn2 = new Mesin();
        msn2.setMerek("Ducati");
        SepedaMotor ducati = new SepedaMotor("Ducati", msn2);
        System.out.println(ducati.getMerekMotor());
        ducati.tambahKecepatanMotor();
        msn2.nyalakanMesin();
        ducati.tambahKecepatanMotor();
        ducati.tambahKecepatanMotor();
        ducati.tambahKecepatanMotor();
        ducati.tambahKecepatanMotor();
        ducati.tambahKecepatanMotor();
        
        System.out.println();
        
        Mesin msn3 = new Mesin();
        msn3.setMerek("Yamaha");
        SepedaMotor yamaha = new SepedaMotor("Yamaha", msn3);
        System.out.println(yamaha.getMerekMotor());
        msn3.nyalakanMesin();
        yamaha.tambahKecepatanMotor();
        yamaha.kurangiKecepatanMotor();
        yamaha.kurangiKecepatanMotor();
        msn3.matikanMesin();
        
        System.out.println();
        
        Mesin msn4 = new Mesin();
        msn4.setMerek("Suzuki");
        SepedaMotor suzuki = new SepedaMotor("Suzuki", msn4);
        System.out.println(suzuki.getMerekMotor());
        msn4.nyalakanMesin();
        suzuki.tambahKecepatanMotor();
        suzuki.tambahKecepatanMotor();
        suzuki.tambahKecepatanMotor();
        suzuki.tambahKecepatanMotor();
        suzuki.tambahKecepatanMotor();
        /*msn.setMerek("Honda");
        SepedaMotor honda = new SepedaMotor("Vario", msn);
        System.out.println(honda.getMerekMotor());
        System.out.println(honda.getMerekMesin());
        honda.tambahKecepatanMotor();
        honda.tambahKecepatanMotor();
        honda.kurangiKecepatanMotor();

        System.out.println();
        Mesin msn1 = new Mesin();
        msn1.setMerek("Yamaha");
        SepedaMotor yamaha = new SepedaMotor("NMax", msn1);
        System.out.println(yamaha.getMerekMotor());
        System.out.println(yamaha.getMerekMesin());
        yamaha.tambahKecepatanMotor();
        yamaha.tambahKecepatanMotor();
        yamaha.kurangiKecepatanMotor();*/
    }
}
