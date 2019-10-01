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
public class Mesin {

    private double kecepatan = 0;
    private boolean mesin = false;
//    private boolean motor = false;
    private String merek;

    Mesin(String merek) {
        this.merek = merek;
    }

    Mesin() {

    }

    public void nyalakanMesin() {
        this.mesin = true;
    }
//    public boolean nyalanMotor(){
//        motor=true;
//        return motor;
//    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan() {
        if (mesin == true) {
            this.nyalakanMesin();
            switch (merek) {
                case "Honda":
                    kecepatan +=10;
                    if (kecepatan >= 100) {
                        System.out.println("Anda Melebihi Batas");
                    }
                    break;
                case "Yamaha":
                    kecepatan +=15;
                    if (kecepatan >= 100) {
                        System.out.println("Anda Melebihi Batas");
                    }
                    break;
                case "Suzuki":
                    kecepatan +=25;
                    if (kecepatan >= 100) {
                        System.out.println("Anda Melebihi Batas");
                    }
                    break;
                case "Ducati":
                    kecepatan +=50;
                    if (kecepatan >= 200) {
                        System.out.println("Anda Melebihi Batas");
                    }
                    break;
            }
        } else {
            System.out.println("Nyalakan Mesin terlebih dahulu");
        }
    }

    public void kurangiKecepatan() {
        if (mesin == true) {
            switch (merek) {
                case "Honda":
                    kecepatan -=5;

                    if (kecepatan <= 0) {
                        System.out.println("Anda dalam kecetapan minimum, tambah kecepatan!");

                    }
                    break;

                case "Yamaha":
                    kecepatan -=10;

                    if (kecepatan <= 0) {
                        System.out.println("Anda dalam kecetapan minimum, tambah kecepatan!");

                    }
                    break;

                case "Suzuki":
                    kecepatan -=15;

                    if (kecepatan <= 0) {
                        System.out.println("Anda dalam kecetapan minimum, tambah kecepatan!");

                    }
                    break;

                case "Ducati":
                    kecepatan -=30;

                    if (kecepatan <= 0) {
                        System.out.println("Anda dalam kecetapan minimum, tambah kecepatan!");

                    }
                    break;

            }
        } else {
            System.out.println("Nyalakan mesin terlebih dahulu");
        }
    }

    public boolean mesinOff() {
        mesin = false;

        return mesin;
    }
    public void info(){
        System.out.println("Merk Motor: " + merek);
    }
    public void printStatus(){
        if(mesin=true ){
            System.out.println("Tambahan Kecepatan: ");
            tambahKecepatan();
            System.out.println("Kecepatan sepeda motor saat ini " + kecepatan+ " km/jam");
        }
        else if(mesin=false){
            System.out.println("Sepeda motor tidak dapat melakukan penambahan kecepatan!");
        }
        else if(mesin=true ){
            System.out.println("Sepeda motor harus dinyalakan terlebih dahulu!");
        }    
        
    }

}
