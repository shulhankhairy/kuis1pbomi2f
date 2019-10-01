/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author MarcRey
 */
public class Kuis1 {

    public static void main(String[] args) {
        SepedaMotor spd = new SepedaMotor("Ducati");
        spd.setMotorOn();
        spd.tambahKecepatan();
        spd.tambahKecepatan();
        spd.printKecepatan();
        spd.tambahKecepatan();
        spd.tambahKecepatan();
        spd.printKecepatan();
        spd.tambahKecepatan();
        System.out.println("== Hasil :");
        spd.printInfo();

        System.out.println("===============");
        SepedaMotor spd2 = new SepedaMotor("Honda");
        spd2.setMotorOn();
        spd2.tambahKecepatan();
        spd2.tambahKecepatan();
        spd2.kurangKecepatan();
        System.out.println("== Hasil :");
        spd2.printInfo();

        System.out.println("===============");
        SepedaMotor spd3 = new SepedaMotor("Yamaha");
        spd3.setMotorOn();
        spd3.printKecepatan();
        spd3.tambahKecepatan();
        spd3.kurangKecepatan();
        spd3.kurangKecepatan();
        System.out.println("== Hasil :");
        spd3.printInfo();
    }
}