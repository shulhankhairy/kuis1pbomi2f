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
public class SepedaMotor 
{
   private Mesin mesin;
   private String merekMotor;
   
   SepedaMotor(String merekMotor, Mesin merekMesin)
   {
       this.mesin=merekMesin;
       this.merekMotor=merekMotor;
   }
   
   public void setMerekMotor(String merekMotor)
   {
       this.merekMotor=merekMotor;
   }
   
   public String getMerekMotor()
   {
       return merekMotor;
   }
   
   public String getMerkMesin()
   {
       return mesin.getMerek();
   }
   
   public void tambahKecepatan()
   {
       if(mesin.getKecepatan()<=100)
       {
           mesin.tambahKecepatan();
           System.out.println(mesin.getKecepatan()+ " km/jam");
       }
       else 
       {
           System.out.println("Kecepatan mesin telah mencapai batas");
       }
   }
   
   public void kecepatanMotor()
   {
       if(mesin.getMerek()=="Honda" && mesin.getMerek()=="Yamaha" && mesin.getMerek()=="Suzuki")
       {
           if(mesin.getKecepatan()<100)
           {
               System.out.println("Kecepatan sepeda motor sangat normal");
           }
           else if(mesin.getKecepatan()>100)
           {
               System.out.println("Kecepatan sepeda motor melebihi batas normal");
           }
           else 
           {
               System.out.println(mesin.getKecepatan()+"km/jam");
           }
       }
       else if (mesin.getMerek()=="Ducati")
       {    
           if(mesin.getKecepatan()>200)
           {
               System.out.println("Kecepatan motor Ducati melebihi batas maksimum 200 km/jam");
           }
       }
   }
   
   public void tampil()
   {
       
       if(mesin.getKecepatan()<100)
       {
           System.out.println("Kecepatan sepeda motor sangat normal");
       }
       else if(mesin.getKecepatan()>100)
       {
           System.out.println("Kecepatan sepeda motor melebihi batasa normal");
       }
       if(mesin.getKecepatan()>200)
       {
               System.out.println("Kecepatan motor Ducati melebihi batas maksimum 200 km/jam");
       }
   }
   
   public void kurangiKecepatan()
   {
       if(mesin.getKecepatan()>=0)
       {
           mesin.kurangiKecepatan();
           System.out.println(mesin.getKecepatan()+ " km/jam");
       }
       else 
       {
           System.out.println("Mesin Mati");
       }
   }
}
