/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author Ely Nur Rahayu
 */
import java.util.Scanner;
public class Mesin {
    private int kecepatan = 0;
    private final int kecepatanMax = 100;
    private boolean kontakOn = false;
    private String jenis;
    
    Scanner sc = new Scanner(System.in);

    public Mesin() {
    }

    public Mesin(String jenis) {
        this.jenis = jenis;
    }
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if(kontakOn == true){
                switch(jenis){
                    case "Honda" :
                        kecepatan+=10;
                        if(kecepatan > 100 ){
                            kecepatan = kecepatanMax;
                            System.out.println("Kecepatan telah melebihi batas");
                            System.out.print("Kurangi kecepatan hingga mencapai batas maksimum ? (y/n) => ");
                            String yn = sc.next();
                            if(yn.equalsIgnoreCase("y")){
                            kurangiKecepatan(); 
                            }
                            else {
                            System.out.println("Anda berada di kecepatan maksimum");
                            }
                        }
                    break;
                  
                    case "Yamaha" :
                        kecepatan+=15;
                        if(kecepatan > 100 ){
                            kecepatan = kecepatanMax;
                            System.out.println("Kecepatan telah melebihi batas");
                            System.out.print("Kurangi kecepatan hingga mencapai batas maksimum ? (y/n) => ");
                            String yn = sc.next();
                            if(yn.equalsIgnoreCase("y")){
                            kurangiKecepatan(); 
                            }
                            else {
                            System.out.println("Anda berada di kecepatan maksimum");
                            }
                        }
                        break;
                    
                    case "Suzuki" :
                        kecepatan+=25;
                            if(kecepatan > 100 ){
                            kecepatan = kecepatanMax;
                            System.out.println("Kecepatan telah melebihi batas");
                            System.out.print("Kurangi kecepatan hingga mencapai batas maksimum ? (y/n) => ");
                            String yn = sc.next();
                            if(yn.equalsIgnoreCase("y")){
                            kurangiKecepatan(); 
                            }
                            else {
                            System.out.println("Anda berada di kecepatan maksimum");
                            }
                        }
                        break; 
                    default :
                        kecepatan+=50;
                            if(kecepatan > 200 ){
                            kecepatan = 200;
                            System.out.println("Kecepatan telah mencapai "+kecepatan);
                            System.out.print("Kurangi kecepatan ? (y/n) => ");
                            String yn = sc.next();
                            if(yn.equalsIgnoreCase("y")){
                                kurangiKecepatan(); 
                            }
                            else {
                            System.out.println("Anda berada di kecepatan maksimum");
                            }
                        }
                }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karna mesin OFF");
        }
    }
    
    public void kurangiKecepatan(){
            if (kontakOn == true){
                switch(jenis){
                    case "Honda" :
                        kecepatan-=5;
                        break;
                        
                    case "Yamaha" :
                        kecepatan-=10;
                        break;
                    
                    case "Suzuki" :
                        kecepatan-=15;
                        break;
                    
                    case"Ducati" :
                        kecepatan-=30;
                        break;
                }
        } else {
             System.out.println("Kecepatan tidak bisa berkurang karena Mesin OFF! \n");
        }     
    }
    
    public void tampilData(){
        if (kontakOn == true){
        System.out.println("Status\t\t: Kontak On");
        } else {
            System.out.println("Status\t\t: Kontak Off");
        }
        System.out.println("Jenis Mesin\t: " + jenis);
        System.out.println("Kecepatan\t: " + kecepatan);
    }
}

