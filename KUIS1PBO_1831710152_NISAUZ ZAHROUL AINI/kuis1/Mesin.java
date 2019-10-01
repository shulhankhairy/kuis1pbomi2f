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
public class Mesin
{
    private String merek;
    public int kecepatan = 0;
    private boolean mesinOn = false;
    private boolean motorOn = false;
    
    Mesin()
    {
        
    }
    
    public void setMerek(String merekMesin)
    {
        this.merek=merekMesin;
    }
    
    public String getMerek()
    {
        return merek;
    }
    
    public double getKecepatan()
    {
        return kecepatan;
    }
    
    public void nyalakanMesin()
    {
        mesinOn=true;
    }
    public void matikanMesin()
    {
        mesinOn=true;
        kecepatan=0;
    }
    
    public void nyalakanMotor()
    {
        motorOn=true;
    }
    
    public void matikanMotor()
    {
        motorOn=true;
    }
    
    public void tambahKecepatan()
    {
            if(merek=="Honda")
            {
                kecepatan=kecepatan+=10;
            }
            else if(merek=="Yamaha")
            {
                kecepatan=kecepatan+=15;
            }
            else if(merek=="Suzuki")
            {
                kecepatan=kecepatan+=20;
            }
            else if(merek=="Ducati")
            {
                kecepatan=kecepatan+=50;
            }  
    }
    
    public void kurangiKecepatan()
    { 
            
            if(merek=="Honda")
            {
                kecepatan=kecepatan-=5;
            }
            else if(merek=="Yamaha")
            {
                kecepatan=kecepatan-=10;
            }
            else if(merek=="Suzuki")
            {
                kecepatan=kecepatan-=15;
            }
            else if(merek=="Ducati")
            {
                kecepatan=kecepatan-=30;
            }
    }
    
    public void printInfo()
    {
        System.out.println("Merek Motor: " + merek);
    }
    public void printStatus(){
        if(mesinOn==true )
        {
            System.out.println("Kecepatan sepeda motor saat ini " + kecepatan+ " km/jam");
        }
        else if(mesinOn==false)
        {
            System.out.println("Sepeda motor tidak dapat melakukan penambahan kecepatan!");
        }
        else if(mesinOn==true )
        {
            System.out.println("Sepeda motor harus dinyalakan terlebih dahulu!");
        }    
        
    }
    

}
