/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
public class SepedahMotor {
    public static void main(String[] args) {
        Mesin Honda = new Mesin ();
        Mesin Yamaha = new Mesin();
        Mesin Suzuki = new Mesin ();
        Mesin Ducati = new Mesin ();
        
        Honda.setJenisMesin("Honda");
        Honda.setKecepatanAwal(0);
        Honda.matikanMesin();
        Honda.tambahKecepatan(Honda.Status(),Honda.getJenisMesin());
        Honda.tampilData();
        System.out.println(" ");
        Honda.nyalakanMesin();
        Honda.tambahKecepatan(Honda.Status(),Honda.getJenisMesin());
        Honda.tampilData();
        System.out.println(" ");
        Honda.kurangiKecepatan(Honda.Status(),Honda.getJenisMesin());
        Honda.tampilData();
        
        System.out.println("");
        Yamaha.setJenisMesin("Yamaha");
        Yamaha.setKecepatanAwal(0);
        Yamaha.matikanMesin();
        Yamaha.tambahKecepatan(Yamaha.Status(),Yamaha.getJenisMesin());
        Yamaha.tampilData();
        System.out.println("");
        Yamaha.nyalakanMesin();
        Yamaha.tambahKecepatan(Yamaha.Status(),Yamaha.getJenisMesin());
        Yamaha.tampilData();
        System.out.println("");
        Yamaha.kurangiKecepatan(Yamaha.Status(),Yamaha.getJenisMesin());
        Yamaha.tampilData();
        
        System.out.println("");
        Suzuki.setJenisMesin("Suzuki");
        Suzuki.setKecepatanAwal(0);
        Suzuki.matikanMesin();
        Suzuki.tambahKecepatan(Suzuki.Status(),Suzuki.getJenisMesin());
        Suzuki.tampilData();
        System.out.println("");
        Suzuki.nyalakanMesin();
        Suzuki.tambahKecepatan(Suzuki.Status(),Suzuki.getJenisMesin());
        Suzuki.tampilData();
        System.out.println("");
        Suzuki.kurangiKecepatan(Suzuki.Status(),Suzuki.getJenisMesin());
        Suzuki.tampilData();
        
        System.out.println("");
        Ducati.setJenisMesin("Ducati");
        Ducati.setKecepatanAwal(0);
        Ducati.matikanMesin();
        Ducati.tambahKecepatan(Ducati.Status(),Ducati.getJenisMesin());
        Ducati.tampilData();
        System.out.println("");
        Ducati.nyalakanMesin();
        Ducati.tambahKecepatan(Ducati.Status(),Ducati.getJenisMesin());
        Ducati.tampilData();
        System.out.println("");
        Ducati.kurangiKecepatan(Ducati.Status(),Ducati.getJenisMesin());
        Ducati.tampilData();
    }
}

