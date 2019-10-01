/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quispbo1;

/**
 *
 * @author ASUS
 */
public class Mesin {
    private String jenis;
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public Mesin(String mesin) {
        this.jenis = mesin;
    }

    public String getMerek() {
        return jenis;
    }

    public void setMerek(String merek) {
        this.jenis = merek;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if(jenis.equalsIgnoreCase("Honda")){
            if(kontakOn == true){
                kecepatan += 10;
            }else if(kecepatan > 100){
                System.out.println("Kecepatan tidak bisa ditambahkan");
            }
        }else if(jenis.equalsIgnoreCase("Yamaha")){
            if(kontakOn == true){
                kecepatan += 15;
            }else if(kecepatan > 100){
                System.out.println("Kecepatan tidak bisa ditambahkan");
            }
        }else if(jenis.equalsIgnoreCase("Suzuki")){
            if(kontakOn == true){
                kecepatan += 25;
            }else if(kecepatan > 100){
                System.out.println("Kecepatan tidak bisa ditambahkan");
            }
        }else if(jenis.equalsIgnoreCase("Ducati")){
             if(kontakOn == true){
                kecepatan += 50;
            }else if(kecepatan > 200){
                System.out.println("Kecepatan tidak bisa ditambahkan");
            }
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
    
        }
    }
    public void kurangiKecepatan(){
        if(jenis.equalsIgnoreCase("Honda")){
            if(kontakOn == true){
                kecepatan -= 5;
            }else if(kecepatan < 0){
                System.out.println("Kecepatan harus ditambahkan");
            }
        }else if(jenis.equalsIgnoreCase("Yamaha")){
            if(kontakOn == true){
                kecepatan -= 10;
            }else if(kecepatan < 0){
                System.out.println("Kecepatan harus ditambahkan");
            }
        }else if(jenis.equalsIgnoreCase("Suzuki")){
            if(kontakOn == true){
                kecepatan -= 15;
            }else if(kecepatan < 0){
                System.out.println("Kecepatan harus ditambahkan");
            }
        }else if(jenis.equalsIgnoreCase("Ducati")){
             if(kontakOn == true){
                kecepatan -= 30;
            }else if(kecepatan < 0){
                System.out.println("Kecepatan harus ditambahkan");
            }
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
    
        }
    }
     public void print(){
        if(kontakOn ==  true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off ");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    } 
}
