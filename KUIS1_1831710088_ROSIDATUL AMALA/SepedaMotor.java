/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUIS1;

/**
 *
 * @author asus
 */
public class SepedaMotor {
    public static void main(String[] args) {
        Mesin Honda = new Mesin ();
        Honda.setJnsMesin("Honda");
        Honda.setKecepatanAwal(0);
        Honda.matikanMesin();
        Honda.tambahKecepatan(Honda.isStatus(),Honda.getJnsMesin());
        Honda.tampilData();
        System.out.println("");
        Honda.nyalakanMesin();
        Honda.tambahKecepatan(Honda.isStatus(),Honda.getJnsMesin());
        Honda.tampilData();
        System.out.println("");
        Honda.kurangiKecepatan(Honda.isStatus(),Honda.getJnsMesin());
        Honda.tampilData();
    }
}
