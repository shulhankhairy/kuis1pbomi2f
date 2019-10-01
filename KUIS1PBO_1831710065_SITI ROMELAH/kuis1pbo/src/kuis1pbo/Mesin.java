/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kuis1pbo;

/**
 *
 * @author DELL
 */
public class Mesin {
    private String merek;
    private int kecepatan;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public String getMerek() {
        return this.merek;
    }
    public void setMesin(String merekMesin) {
        this.merek = merekMesin;
    }
    
    public void tambahKecepatan() {
        
        if (this.kecepatan>=100){
            this.kecepatan=100;
        } else{
            if(this.merek  == "Honda"){
                this.kecepatan += 10;
            } else if(this.merek == "Yamaha"){
                this.kecepatan += 15;
            } else if(this.merek == "Suzuki"){
                this.kecepatan += 25;
            } else if(this.merek == "Ducati"){
                this.kecepatan += 50;
            }
        }
        System.out.print("tambah kecepatan \t:");
        System.out.println(this.kecepatan+"km/jam");
    }
    public void kurangiKecepatan() {
        if (this.kecepatan<=0){
            this.kecepatan=0;
        } else{
            if(this.merek  == "Honda"){
                this.kecepatan -= 5;
            } else if(this.merek == "Yamaha"){
                this.kecepatan -= 10;
            } else if(this.merek == "Suzuki"){
                this.kecepatan -= 15;
            } else if(this.merek == "Ducati"){
                this.kecepatan -= 30;
            }
        }
        System.out.print("kurangi kecepatan \t:");
        System.out.println(this.kecepatan+"km/jam");
        }
    
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Mesin On");
        }
        else{
            System.out.println("Mesin Off");
        }    
    }
}
