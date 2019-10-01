/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal;

import java.util.Scanner;

/**
 *
 * @author Sherin Lendiska Wulandari
 */
public class Mesin {
     Scanner sc = new Scanner (System.in);
    private int kecepatan = 0;
    private final int kecepatanmax = 100;
    private boolean kontakOn = false;
    private String mesin;

    public Mesin(){
        
    }
    public Mesin(String mesin) {
        this.mesin = mesin;
    }

    public void nyalakanMesin()
    {
        kontakOn = true;
    }
    public void matikanMesin()
    {
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan()
    {
        //penjelasan :
        //ketika kecepatan sudah sampai maximum
        //maka, program akan menanyakan user, apakah ingin mengurangi kecepatan atau tetap pada kecepatan maximum tersebut
        //y = untuk mengurangi kecepatan
        //n = untuk tetap di kecepatan maximum
        if(mesin.equalsIgnoreCase("Yamaha")){
            if(kontakOn == true){
                kecepatan += 15;
                if(kecepatan >= kecepatanmax){
                    System.out.println("Kecepatan anda : "+kecepatanmax+" maksimum! harus di kurangi ?");
                    String yn = sc.next();
                    if(yn.equalsIgnoreCase("y")){
                        kurangiKecepatan();
                    }
                    else{
                        System.out.println("Hati-hati ! Anda berada pada kecepatan 100 !");
                        kecepatan = kecepatanmax;
                    }
                }
                
            }else{
                System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");       
            }
        }
        else if(mesin.equalsIgnoreCase("Honda")){
            if(kontakOn == true){
                kecepatan += 10;
                if(kecepatan >= kecepatanmax){
                    System.out.println("Kecepatan anda : "+kecepatanmax+" maksimum! harus di kurangi ?");
                    String yn = sc.next();
                    if(yn.equalsIgnoreCase("y")){
                        kurangiKecepatan();
                    }
                    else{
                        System.out.println("Hati-hati ! Anda berada pada kecepatan 100 !");
                        kecepatan = kecepatanmax;
                    }
                }
                
            }else{
                System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");       
            }
        }
        else if(mesin.equalsIgnoreCase("Suzuki")){
            if(kontakOn == true){
                kecepatan += 25;
                if(kecepatan >= kecepatanmax){
                    System.out.println("Kecepatan anda : "+kecepatanmax+" maksimum! harus di kurangi ?");
                    String yn = sc.next();
                    if(yn.equalsIgnoreCase("y")){
                        kurangiKecepatan();
                    }
                    else{
                        System.out.println("Hati-hati ! Anda berada pada kecepatan 100 !");
                        kecepatan = kecepatanmax;
                    }
                }
                
            }else{
                System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");       
            }
        }
        else if(mesin.equalsIgnoreCase("Ducati")){
            if(kontakOn == true){
                kecepatan += 50;
                if(kecepatan >= 200){
                    System.out.println("Kecepatan anda : 200 km/jam maksimum! harus di kurangi ?");
                    String yn = sc.next();
                    if(yn.equalsIgnoreCase("y")){
                        kurangiKecepatan();
                    }
                    else{
                        System.out.println("Hati-hati ! Anda berada pada kecepatan 100 !");
                        kecepatan = 200;
                    }
                }
                
            }else{
                System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");       
            }
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
        
    }
    public void kurangiKecepatan()
    {
        if(mesin.equalsIgnoreCase("Honda")){
            if(kontakOn == true){
                kecepatan -= 5;
            }else{
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
            }
        }
        else if(mesin.equalsIgnoreCase("Yamaha")){
            if(kontakOn == true){
                kecepatan -= 10;
            }else{
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
            }
        }
        else if(mesin.equalsIgnoreCase("Suzuki")){
            if(kontakOn == true){
                kecepatan -= 15;
            }else{
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
            }
        }
        else if(mesin.equalsIgnoreCase("Ducati")){
            if(kontakOn == true){
                kecepatan -= 30;
            }else{
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
            }
        }
        else{
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
        
        
    }
    public void printStatus()
    {
        System.out.println("Merek Mesin\t: "+mesin);
        if(kontakOn == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
}
