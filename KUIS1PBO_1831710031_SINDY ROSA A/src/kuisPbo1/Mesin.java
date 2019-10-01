/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisPbo1;

/**
 *
 * @author SINDY
 */
public class Mesin {
    private String merek;
    private int kecepatan=0;
    private boolean mesinOn = false;
    
    public void setMerek(String merek){
        this.merek = merek;
    }
    public String getMerek(){
      return merek;
    }
    public int getKecepatan(){
       return kecepatan;
    }
    public void nyalakanMesin(){
        mesinOn = true;
    }
    public void matikanMesin(){
        mesinOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if(mesinOn == true){
        
            if(merek.equalsIgnoreCase("Yamaha")){
                kecepatan += 15;
                if(kecepatan > 100){
                }
            }else if(merek.equalsIgnoreCase("Honda")){
                kecepatan += 10;
                if(kecepatan > 100){
                }
            }else if(merek.equalsIgnoreCase("Suzuki")){
                kecepatan += 25;
                if(kecepatan > 100){
                }
            }else if(merek.equalsIgnoreCase("Ducati")){
                kecepatan += 50;
                if(kecepatan > 200){
                }
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
        }
    }
    public void kurangKecepatan(){
        if(mesinOn == true){
        
            if(merek.equalsIgnoreCase("Yamaha")){
                kecepatan -= 10;
                if(kecepatan < 0){
                }
            }else if(merek.equalsIgnoreCase("Honda")){
            kecepatan -= 5;
                if(kecepatan < 0){
                }
            }
            else if(merek.equalsIgnoreCase("Suzuki")){
                kecepatan -= 15;
                if(kecepatan < 0){
                }
            }else if(merek.equalsIgnoreCase("Ducati")){
                kecepatan -= 30;
                if(kecepatan < 0){
                }
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n ");
        }
        }
    }
    public void cetakStatusMotor(){
        if(mesinOn == true){
            System.out.println("Mesin On");
        }
        else {
            System.out.println("Mesin Off");
        }
        System.out.println("kecepatan "+ kecepatan + "\n");
    }
}
