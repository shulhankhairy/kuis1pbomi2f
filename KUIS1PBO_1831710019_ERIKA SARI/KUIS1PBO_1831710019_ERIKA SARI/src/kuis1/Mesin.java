/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author windows x
 */
public class Mesin {
  private String jenisMesin;
  private double kecepatan=0;
  private boolean kontakOn = false;
  
  
  public void setJenis(String jenisMesin){
    this.jenisMesin = jenisMesin;
  }
  
  public String getJenis(){
     return jenisMesin;
  }
  
  public double getKecepatan(){
      return kecepatan;
  }
  public void nyalakanMesin(){
      kontakOn = true;
  }
    
  public void matikanMesin(){
      kontakOn = false;
      kecepatan =0;
  }
  public void tambahKecepatan(){
      if(kontakOn == true){
          
      if(jenisMesin.equalsIgnoreCase("Honda")){
          kecepatan +=10;
            if (kecepatan >=100){
              kecepatan = 100;
          }
      }else if(jenisMesin.equalsIgnoreCase("Yamaha")){
          kecepatan +=15;
          if (kecepatan >=100){
              kecepatan = 100;
          }
      }else if(jenisMesin.equalsIgnoreCase("Suzuki")){
          kecepatan +=25;
          if (kecepatan >=100){
              kecepatan = 100;
          }
      }else if(jenisMesin.equalsIgnoreCase("Ducati")){
          kecepatan +=50;
          if (kecepatan >=100){
              kecepatan = 200;
          }
      }
      
      }
     
  }

      public void kurangKecepatan(){
         if(kontakOn == true){
         if(jenisMesin.equalsIgnoreCase("Honda")){
          kecepatan -=10;
          if (kecepatan <=0){
              kecepatan = 0;
          }
      }else if(jenisMesin.equalsIgnoreCase("Yamaha")){
          kecepatan -=10;
          if (kecepatan <=0){
              kecepatan = 0;
          }
      }else if(jenisMesin.equalsIgnoreCase("Suzuki")){
          kecepatan -=15;
          if (kecepatan <=0){
              kecepatan = 0;
          }
      }else if(jenisMesin.equalsIgnoreCase("Ducati")){
          kecepatan -=30;
          if (kecepatan <=0){
              kecepatan = 0;
          }
      }else{
          System.out.println("");
        }
      }
      }
      public void printStatus(){
          if(kontakOn == true){
              System.out.println("Kontak on");
          }else{
              System.out.println("Kontak off");
          }
          System.out.println("Mesin : " + jenisMesin);
          System.out.println("");
      }
  }