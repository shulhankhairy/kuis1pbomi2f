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
public class Mesin {

    private String mesin;
    private int kecepatan = 0;
    private boolean mesinMenyala = false;

    public Mesin(String mesin) {
        this.mesin = mesin;
    }

    public String getMesin() {
        return mesin;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setMesin(String mesin) {
        this.mesin = mesin;
    }

    public void setMesinOn() {
        this.mesinMenyala = true;
    }

    public void setMesinOff() {
        this.kecepatan = 0;
        this.mesinMenyala = false;
    }

    public void tambahKecepatan(String merk) {
        if (this.mesinMenyala) {
            if (merk.equals("Honda") && cekKecepatan(10, true)) {
                this.kecepatan += 10;
            } else if (merk.equals("Yamaha") && cekKecepatan(15, true)) {
                this.kecepatan += 15;
            } else if (merk.equals("Suzuki") && cekKecepatan(25, true)) {
                this.kecepatan += 25;
            } else if (merk.equals("Ducati") && cekKecepatanDucati(50, true)) {
                this.kecepatan += 50;
            } else {
                System.out.println("kecepatan max");
            }
        } else{
            System.out.println("Mesin masih mati");
        }
    }

    public void kurangiKecepatan(String merk) {
        if (this.mesinMenyala) {
            if (merk.equals("Honda") && cekKecepatan(5, false)) {
                this.kecepatan -= 5;
            } else if (merk.equals("Yamaha") && cekKecepatan(10, false)) {
                this.kecepatan -= 10;
            } else if (merk.equals("Suzuki") && cekKecepatan(15, false)) {
                this.kecepatan -= 15;
            } else if (merk.equals("Ducati") && cekKecepatanDucati(30, false)) {
                this.kecepatan -= 30;
            } else {
                System.out.println("kecepatan kurang");
            }
        } else {
            System.out.println("Mesin masih mati");
        }
    }

    public void printInfoMesin() {
        System.out.println("Mesin menyala : " + this.mesinMenyala);
        System.out.println("Jenis Mesin : " + getMesin());
        System.out.println("Kecepatan motor : " + getKecepatan());
    }

    public void printKecepatan() {
        System.out.println("Kecepatan motor : " + getKecepatan());
    }

    public boolean cekKecepatan(int kecepatan, boolean plus) {
        if (plus) {
            return (kecepatan + this.kecepatan) <= 100;
        } else if(!plus){
            return (this.kecepatan - kecepatan ) > 0;
        }
        return false;
    }

    public boolean cekKecepatanDucati(int kecepatan, boolean plus) {
        if(plus){
            return (kecepatan + this.kecepatan) <= 200;
        }else if(!plus){
            return (this.kecepatan + kecepatan) > 0;
        }
        return false;
    }
}
