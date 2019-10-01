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
public class Kuis1Main {
    public static void main (String [] args){
    Kuis1 str1 = new Kuis1();
    Kuis1 str2 =  new Kuis1();
    Kuis1 str3 = new Kuis1();
    Kuis1 str4 =  new Kuis1();
    
    str1.setMerek("Honda");
    str1.status("Nyala");
    str1.tambahKecepatan(10);
    str1.kurangiKecepatan(5);
    str1.min(0);
    str1.cetakStatus();
    
    System.out.println("");
    str2.setMerek("Yamaha");
    str2.status("Nyala");
    str2.tambahKecepatan(15);
    str2.kurangiKecepatan(10);
    str2.min(0);
    str2.cetakStatus();
    
    System.out.println("");
    str3.setMerek("Suzuki");
    str3.status("Off");
    str3.tambahKecepatan(15);
    str3.kurangiKecepatan(15);
    str3.min(0);
    str3.cetakStatus();
    
    System.out.println("");
    str4.setMerek("Ducati");
    str4.status("Nyala");
    str4.tambahKecepatan(50);
    str4.kurangiKecepatan(30);
    str4.min(0);
    str4.cetakStatusDucati();
    }
    
}
