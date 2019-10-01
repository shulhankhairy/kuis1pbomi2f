/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author Nisauz
 */
public class kuis1Main 
{
    public static void main(String[] args)
    {
        Mesin mesinHonda = new Mesin();
        mesinHonda.setMerek("Honda");
        SepedaMotor Honda = new SepedaMotor("Honda",mesinHonda);
        System.out.println(Honda.getMerekMotor());
        mesinHonda.nyalakanMesin();
        mesinHonda.nyalakanMotor();
        Honda.tambahKecepatan();
        Honda.tambahKecepatan();
        Honda.kurangiKecepatan();
        mesinHonda.printStatus();
        Honda.kecepatanMotor();
        Honda.tampil();
        
        System.out.println();
        
        Mesin mesinYamaha = new Mesin();
        mesinYamaha.setMerek("Yamaha");
        SepedaMotor Yamaha = new SepedaMotor("Yamaha",mesinYamaha);
        System.out.println(Yamaha.getMerekMotor());
        mesinYamaha.nyalakanMesin();
        mesinYamaha.nyalakanMotor();
        Yamaha.tambahKecepatan();
        Yamaha.tambahKecepatan();
        Yamaha.kurangiKecepatan();
        mesinYamaha.printStatus();
        Yamaha.kecepatanMotor();
        Yamaha.tampil();
        
        System.out.println();
        
        Mesin mesinSuzuki = new Mesin();
        mesinSuzuki.setMerek("Suzuki");
        SepedaMotor Suzuki = new SepedaMotor("Suzuki",mesinSuzuki);
        System.out.println(Yamaha.getMerekMotor());
        mesinSuzuki.nyalakanMesin();
        mesinSuzuki.nyalakanMotor();
        Suzuki.tambahKecepatan();
        Suzuki.tambahKecepatan();
        Suzuki.kurangiKecepatan();
        mesinSuzuki.printStatus();
        Suzuki.kecepatanMotor();
        Suzuki.tampil();
        
        System.out.println();
        
        
        Mesin mesinDucati = new Mesin();
        mesinDucati.setMerek("Ducati");
        SepedaMotor Ducati = new SepedaMotor("Ducati",mesinDucati);
        System.out.println(Ducati.getMerekMotor());
        mesinDucati.nyalakanMesin();
        mesinDucati.nyalakanMotor();
        Ducati.tambahKecepatan();
        Ducati.tambahKecepatan();
        Ducati.kurangiKecepatan();
        mesinDucati.printStatus();
        Ducati.kecepatanMotor();
        Ducati.tampil();
        
        System.out.println();
        
        
        
        
        
    }
}
