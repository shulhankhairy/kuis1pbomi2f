/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quis1;

/**
 *
 * @author HP TEVAN
 */
public class SepedaMain {
    public static void main(String[] args) {
        Mesin honda = new Mesin();
        Mesin yamaha = new Mesin();
        Mesin suzuki = new Mesin();
        Mesin ducati = new Mesin();
        
        honda.setJenisMesin("Honda");
        honda.setKecepatanAwal(0);
        //honda.nyalakanMesin();
        honda.matikanMesin();
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println("");
        honda.nyalakanMesin();
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println("");
        System.out.println("Kurangi kecepatan");
        honda.kurangiKecepatan(honda.isStatus(),honda.getJenisMesin());
        //honda.tambahKecepatan();
        honda.tampilData();
        System.out.println("");
        
        System.out.println("==========================================");
        yamaha.setJenisMesin("Yamaha");
        yamaha.setKecepatanAwal(0);
        //yamaha.nyalakanMesin();
        yamaha.matikanMesin();
        yamaha.tambahKecepatan(yamaha.isStatus(), yamaha.getJenisMesin());
        yamaha.tampilData();
        System.out.println("");
        yamaha.nyalakanMesin();
        yamaha.tambahKecepatan(yamaha.isStatus(), yamaha.getJenisMesin());
        yamaha.tampilData();
        System.out.println();
        System.out.println("Kurangi kecepatan");
        yamaha.kurangiKecepatan(yamaha.isStatus(), yamaha.getJenisMesin());
        //yamaha.tambahKecepatan();
        yamaha.tampilData();
        System.out.println("");
        
        System.out.println("==========================================");
        suzuki.setJenisMesin("Suzuki");
        suzuki.setKecepatanAwal(0);
        //suzuki.nyalakanMesin();
        suzuki.matikanMesin();
        suzuki.tambahKecepatan(suzuki.isStatus(), suzuki.getJenisMesin());
        suzuki.tampilData();
        System.out.println("");
        suzuki.nyalakanMesin();
        suzuki.tambahKecepatan(suzuki.isStatus(), suzuki.getJenisMesin());
        suzuki.tampilData();
        System.out.println();
        System.out.println("Kurangi kecepatan");
        suzuki.kurangiKecepatan(suzuki.isStatus(), suzuki.getJenisMesin());
        //suzuki.tambahKecepatan();
        suzuki.tampilData();
        System.out.println("");
        
        System.out.println("==========================================");
        ducati.setJenisMesin("Ducati");
        ducati.setKecepatanAwal(0);
        //ducati.nyalakanMesin();
        ducati.matikanMesin();
        ducati.tambahKecepatan(ducati.isStatus(), ducati.getJenisMesin());
        ducati.tampilData();
        System.out.println("");
        ducati.nyalakanMesin();
        ducati.tambahKecepatan(ducati.isStatus(), ducati.getJenisMesin());
        ducati.tampilData();
        System.out.println();
         ducati.tambahKecepatan(ducati.isStatus(), ducati.getJenisMesin());
        ducati.tampilData();
        System.out.println();
        ducati.tambahKecepatan(ducati.isStatus(), ducati.getJenisMesin());
        ducati.tampilData();
        System.out.println();
         ducati.tambahKecepatan(ducati.isStatus(), ducati.getJenisMesin());
        ducati.tampilData();
        System.out.println();
        System.out.println("Kurangi kecepatan");
        ducati.kurangiKecepatan(ducati.isStatus(), ducati.getJenisMesin());
        //ducati.tambahKecepatan();
        ducati.tampilData();
    }
}