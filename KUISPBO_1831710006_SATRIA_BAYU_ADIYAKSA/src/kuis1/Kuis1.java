/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author SATRIA
 */
public class Kuis1 {
    private String merek;
    private int kecepatan;
    private int min;
    private int max;
    private int maxx;
    private String status;
    
    public void setMerek(String newValue){
        merek = newValue;
    }
    public void status(String newValue){
        status =  newValue;
    }
    public void min(int newValue){
        min =  newValue;
    }
     public void max(int newValue){
        max =  newValue;
    }
    public void maxx(int newValue){
        maxx =  newValue;
    }
    public void tambahKecepatan(int increment){
        kecepatan = kecepatan + increment;
    }
    public void kurangiKecepatan(int decrement){
        kecepatan = kecepatan - decrement;
    }
    
    public void cetakStatus(){
        System.out.println("Merk: "+merek);
        System.out.println("Status Mesin: "+status);
        System.out.println("Kecepatan: "+kecepatan+" km/jam");
        System.out.println("Kecepatan Minimum: "+min+" km/jam");
        System.out.println("Kecepatan Maximal:"+" 100 km/jam");
    }
    public void cetakStatusDucati(){
        System.out.println("Merk: "+merek);
        System.out.println("Status Mesin: "+status);
        System.out.println("Kecepatan: "+kecepatan+" km/jam");
        System.out.println("Kecepatan Minimum: "+min+" km/jam");
        System.out.println("Kecepatan Maximal:"+" 200 km/jam");
    }
}
