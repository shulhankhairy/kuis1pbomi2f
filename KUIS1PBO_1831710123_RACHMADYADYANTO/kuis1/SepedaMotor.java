/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kuis1;

/**
 *
 * @author Rachmad Yadyanto
 */
public class SepedaMotor {
    public static void main(String[] args) {
        Mesin honda = new Mesin ();
        Mesin yamaha = new Mesin();
        Mesin suzuki = new Mesin ();
        Mesin ducati = new Mesin ();
        
        honda.setJenisMesin("honda");
        honda.setKecepatanAwal(0);
        //honda.nyalakanMesin();
        honda.matikanMesin();
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println(" ");
        honda.nyalakanMesin();
        
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println(" ");
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println(" ");
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println(" ");
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println(" ");
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println(" ");
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println(" ");
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println(" ");
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println(" ");
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println(" ");
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println(" ");
        
        
        System.out.println(" --kecepatan mengurang-- ");
        honda.kurangiKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        
        System.out.println("");
        yamaha.setJenisMesin("yamaha");
        yamaha.setKecepatanAwal(0);
        
        yamaha.matikanMesin();
        yamaha.tambahKecepatan(yamaha.isStatus(),yamaha.getJenisMesin());
        yamaha.tampilData();
        System.out.println("");
        yamaha.nyalakanMesin();
        
        yamaha.tambahKecepatan(yamaha.isStatus(),yamaha.getJenisMesin());
        yamaha.tampilData();
        System.out.println("");
        yamaha.tambahKecepatan(yamaha.isStatus(),yamaha.getJenisMesin());
        yamaha.tampilData();
        System.out.println("");
        yamaha.tambahKecepatan(yamaha.isStatus(),yamaha.getJenisMesin());
        yamaha.tampilData();
        System.out.println(""); 
        yamaha.tambahKecepatan(yamaha.isStatus(),yamaha.getJenisMesin());
        yamaha.tampilData();
        System.out.println("");
        yamaha.tambahKecepatan(yamaha.isStatus(),yamaha.getJenisMesin());
        yamaha.tampilData();
        System.out.println("");
        yamaha.tambahKecepatan(yamaha.isStatus(),yamaha.getJenisMesin());
        yamaha.tampilData();
        System.out.println("");
        
        System.out.println(" --kecepatan mengurang-- ");
        yamaha.kurangiKecepatan(yamaha.isStatus(),yamaha.getJenisMesin());
        //honda.tambahKecepatan();
        yamaha.tampilData();
        
        System.out.println("");
        suzuki.setJenisMesin("suzuki");
        suzuki.setKecepatanAwal(0);
        
        suzuki.matikanMesin();
        suzuki.tambahKecepatan(suzuki.isStatus(),suzuki.getJenisMesin());
        suzuki.tampilData();
        System.out.println("");
        suzuki.nyalakanMesin();
        
        suzuki.tambahKecepatan(suzuki.isStatus(),suzuki.getJenisMesin());
        suzuki.tampilData();
        System.out.println("");
        suzuki.tambahKecepatan(suzuki.isStatus(),suzuki.getJenisMesin());
        suzuki.tampilData();
        System.out.println("");
        suzuki.tambahKecepatan(suzuki.isStatus(),suzuki.getJenisMesin());
        suzuki.tampilData();
        System.out.println("");
        suzuki.tambahKecepatan(suzuki.isStatus(),suzuki.getJenisMesin());
        suzuki.tampilData();
        System.out.println("");
        
        System.out.println(" --kecepatan mengurang-- ");
        suzuki.kurangiKecepatan(suzuki.isStatus(),suzuki.getJenisMesin());
        suzuki.tampilData();
        
        System.out.println("");
        ducati.setJenisMesin("ducati");
        ducati.setKecepatanAwal(0);
        //honda.nyalakanMesin();
        ducati.matikanMesin();
        ducati.tambahKecepatan(ducati.isStatus(),ducati.getJenisMesin());
        ducati.tampilData();
        System.out.println("");
        ducati.nyalakanMesin();
        
        ducati.tambahKecepatan(ducati.isStatus(),ducati.getJenisMesin());
        ducati.tampilData();
        System.out.println("");
        ducati.tambahKecepatan(ducati.isStatus(),ducati.getJenisMesin());
        ducati.tampilData();
        System.out.println("");
        ducati.tambahKecepatan(yamaha.isStatus(),ducati.getJenisMesin());
        ducati.tampilData();
        System.out.println("");
        ducati.tambahKecepatan(yamaha.isStatus(),ducati.getJenisMesin());
        ducati.tampilData();
        System.out.println("");
        
        System.out.println(" --kecepatan mengurang-- ");
        ducati.kurangiKecepatan(ducati.isStatus(),ducati.getJenisMesin());
        ducati.tampilData();
    }
}
