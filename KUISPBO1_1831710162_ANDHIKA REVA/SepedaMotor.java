/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andhika
 */
public class SepedaMotor {
     public static void main(String[] args) {
        Mesin honda = new Mesin ();
        honda.setJnsMesin("yamaha");
        honda.setspeedAwal(0);
        honda.matikanMesin();
        honda.tambahSpeed(honda.isStatus(),honda.getJnsMesin());
        honda.tampilData();
        System.out.println("");
        honda.nyalakanMesin();
        honda.tambahSpeed(honda.isStatus(),honda.getJnsMesin());
        honda.tampilData();
        System.out.println("");
        honda.kurangiSpeed(honda.isStatus(),honda.getJnsMesin());
        honda.tampilData();
    }
}