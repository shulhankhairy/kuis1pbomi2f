/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class SepedaMotor {
    private String merek;
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public SepedaMotor(String merek) {
        this.merek = merek;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public boolean isKontakOn() {
        return kontakOn;
    }

    public void setKontakOn(boolean kontakOn) {
        this.kontakOn = kontakOn;
    }
   
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    
    public void matikanMesin(){
        kontakOn = false;
        kecepatan =0;
    }
    
    public void setMerek(String newValue)
    {
        merek = newValue;
    }
   
  public void tambahKecepatan(){
        if(kontakOn == true){
            if(kecepatan <= 100){
                if(merek == "Honda"){
                    kecepatan +=10;
                }
                else if(merek == "Yamaha"){
                    kecepatan +=15;
                }
                else if(merek == "Suzuki"){
                    kecepatan +=25;
                }
            }
            else{
                System.out.println("Kecepatan sudah mencapai batas maksimal!! \n");
            }
            if(kecepatan <= 200){
                if(merek == "Ducati"){
                    kecepatan +=50;
                }
            }
            else{
                System.out.println("Kecepatan sudah mencapai batas maksimal!! \n");
            }
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
   
    public void kurangiKecepatan(){
        if (kontakOn == true){
             if (merek == "Honda"){
            kecepatan -= 5;
        }else if(merek == "Yamaha"){
            kecepatan -= 10;
        }
        else if(merek == "Suzuki"){
            kecepatan -= 15;
        }
        else  if(merek == "Ducati"){ 
            kecepatan -= 30;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    }   
   public void printStatus(){
        if (kontakOn == true){
            System.out.println("Kontak on");
            System.out.println("merek: "+merek);
        }
        else{
            System.out.println("Kontak off");
            System.out.println("merek: "+merek);
        }
        System.out.println("Kecepatan "+ kecepatan+"\n");
    }
}
