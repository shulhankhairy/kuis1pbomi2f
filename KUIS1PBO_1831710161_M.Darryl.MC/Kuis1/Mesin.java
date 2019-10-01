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
public class Mesin {   
    private int kecepatan;
    private boolean status;
        
    public boolean getStatus() {
        return status;
    }

    public void setStauts(boolean stauts) {
        this.status = stauts;
    }
    
    public int getKecepatan()
    {
        return kecepatan;
    }
    
    public void tambahKecepatan(int speedup)
    {
        kecepatan = kecepatan + speedup;
    }
    public void kurangiKecepatan(int speeddown)
    {
        kecepatan = kecepatan - speeddown;
    }     
    public void resetSpeed()
    {
        kecepatan = 0;
    }
    
    public int info()
    {        
        return kecepatan;
    }    
}
