/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisPbo1;

/**
 *
 * @author SINDY
 */
public class kuisDemo {
    public static void main(String[] args) {
        Mesin mesin = new Mesin();
        mesin.nyalakanMesin();

        System.out.println("------------------------------------------");
        SepedaMotor yamaha = new SepedaMotor("Mio", "Yamaha", mesin);
        yamaha.cetakStatusMotor();
        System.out.println("===========================================");
        System.out.println(yamaha.getemerekMotor());
        System.out.println(yamaha.getemerekMesin());
        yamaha.tambahKecepatanMotor();
        yamaha.kurangiKecepatanMotor();
        
        System.out.println("------------------------------------------");
        SepedaMotor honda = new SepedaMotor("Beat", "Honda", mesin);
        honda.cetakStatusMotor();
        System.out.println("===========================================");
        System.out.println(honda.getemerekMotor());
        System.out.println(honda.getemerekMesin());
        honda.tambahKecepatanMotor();
        honda.kurangiKecepatanMotor();
        
        System.out.println("------------------------------------------");
        SepedaMotor suzuki = new SepedaMotor("Nex", "Suzuki", mesin);
        suzuki.cetakStatusMotor();
        System.out.println("===========================================");
        System.out.println(suzuki.getemerekMotor());
        System.out.println(suzuki.getemerekMesin());
        suzuki.tambahKecepatanMotor();
        suzuki.kurangiKecepatanMotor();
        
        System.out.println("-------------------------------------------");
        SepedaMotor ducati = new SepedaMotor("Scrambler Urban Enduro", "Ducati", mesin);
        ducati.cetakStatusMotor();
        System.out.println("===========================================");
        System.out.println(ducati.getemerekMotor());
        System.out.println(ducati.getemerekMesin());
        ducati.tambahKecepatanMotor();
        ducati.kurangiKecepatanMotor();
        
        System.out.println("------------------------------------------");
        mesin.matikanMesin();
        mesin.cetakStatusMotor();
        System.out.println("------------------------------------------");
    }
}
