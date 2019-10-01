/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.Kuis1;

/**
 *
 * @author user
 */
public class SepedahMotor {    
    
    private String merk;
    private boolean status;
    Mesin engine = new Mesin();
    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }        
    
    public String getMerk()
    {
        return merk;
    }
    public void setMerk(String newMerk)
    {
       this.merk = newMerk; 
    }
    public void incSpeed()
    {        
        if(merk.equalsIgnoreCase("Honda"))
        {            
            engine.tambahKecepatan(10);
        }
        else if(merk.equalsIgnoreCase("Yamaha"))
        {
            if(engine.getKecepatan() == 90)
            {
                engine.tambahKecepatan(10);
            }
            else
            {
                engine.tambahKecepatan(15);
            }                
        }
        else if(merk.equalsIgnoreCase("Suzuki"))
        {
            engine.tambahKecepatan(25);
        }
        else if(merk.equalsIgnoreCase("ducati"))
        {
            engine.tambahKecepatan(50);
        }
        else
        {
            System.out.println("Your speed is MAX : "+ engine.info());
        }
    }
    public void decSpeed()
    {        
        if(merk.equalsIgnoreCase("Honda"))
        {
            engine.kurangiKecepatan(5);
        }
        else if(merk.equalsIgnoreCase("Yamaha"))
        {
            engine.kurangiKecepatan(10);
        }
        else if(merk.equalsIgnoreCase("Suzuki"))
        {
            engine.kurangiKecepatan(15);
        }
        else if(merk.equalsIgnoreCase("ducati"))
        {
            engine.kurangiKecepatan(30);
        }
        else
        {
            System.out.println("Your speed is 0 ");
        }
    }
    
}
