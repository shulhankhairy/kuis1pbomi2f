
package Kuis1;

public class Mesin extends SepedaMotor{
    private int kecepatan = 0;
    private boolean kontakOn = true;
    public String merekMesin;
    
    public Mesin(){
        
    }
    
    public Mesin(String merekMesin){
        this.merekMesin = merekMesin;
    }
    
    public void mesinNyala(){
        kontakOn = true;
    }
    
    public void mesinMati(){
        kontakOn = false;
        kecepatan = 0;
    }
    
    public void tambahKecepatanHonda(){
        if(kontakOn == true){
            kecepatan += 10;
        }
        else{
            System.out.println("Kecepatan tidak Bertambah ~ Mesin OFF! \n");
        }
    }
    
    public void kurangiKecepatanHonda(){
        if(kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak Berkurang ~ Mesin OFF! \n");
        }
    }
    
    public void tambahKecepatanYamaha(){
        if(kontakOn == true){
            kecepatan += 15;
        }
        else{
            System.out.println("Kecepatan tidak Bertambah ~ Mesin OFF! \n");
        }
    }
    
    public void kurangiKecepatanYamaha(){
        if(kontakOn == true){
            kecepatan -= 10;
        }
        else{
            System.out.println("Kecepatan tidak Berkurang ~ Mesin OFF! \n");
        }
    }
    
    public void tambahKecepatanSuzuki(){
        if(kontakOn == true){
            kecepatan += 25;
        }
        else{
            System.out.println("Kecepatan tidak Bertambah ~ Mesin OFF! \n");
        }
    }
    
    public void kurangiKecepatanSuzuki(){
        if(kontakOn == true){
            kecepatan -= 15;
        }
        else{
            System.out.println("Kecepatan tidak Berkurang ~ Mesin OFF! \n");
        }
        
        
    }
    
    public void tambahKecepatanDucati(){
        if(kontakOn == true){
            kecepatan += 50;
        }
        else{
            System.out.println("Kecepatan tidak Bertambah ~ Mesin OFF! \n");
        }
    }
    
    public void kurangiKecepatanDucati(){
        if(kontakOn == true){
            kecepatan -= 30;
        }
        else{
            System.out.println("Kecepatan tidak Berkurang ~ Mesin OFF! \n");
        }
    }
    
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak ON");
        }
        else{
            System.out.println("Kontak OFF");
        }
        System.out.print("Kecepatan " + kecepatan+"\n");
        
        if(kecepatan>=100){
            System.out.print("Kecepatan Maksimum, WASPADA\n");
        }
    }
    
    public void infoMesin(){
        System.out.println("Merek Sepeda : " +merekSepeda);
        System.out.println("Merek Mesin : " +merekMesin);
    }
}