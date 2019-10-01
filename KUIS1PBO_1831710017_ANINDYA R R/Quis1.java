/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quis1;

/**
 *
 * @author Anindya Ref
 */
public class Quis1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SepedaMotor Honda = new SepedaMotor("Honda");
        Honda.nyalakanMotor();
        Honda.info();
        System.out.println("Kecepatan Awal: "+ Honda.getKecepatan());
        System.out.println("Tambahkan Kecepatan: ");
        Honda.tambahKecepatan();
        System.out.println("Kurangi Kecepatan: ");
        Honda.kurangiKecepatan();
        Honda.printStatus();
        
        SepedaMotor Ducati = new SepedaMotor("Ducati");
        Ducati.nyalakanMotor();
        Ducati.info();
        System.out.println("Kecepatan Awal: "+ Ducati.getKecepatan());
        System.out.println("Tambahkan Kecepatan: ");
        Ducati.tambahKecepatan();
        System.out.println("Kurangi Kecepatan: ");
        Ducati.kurangiKecepatan();
        Ducati.printStatus();
//        
    }
    
}
