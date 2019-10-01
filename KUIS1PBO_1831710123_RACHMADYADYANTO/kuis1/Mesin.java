/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kuis1;

/**
 *
 * @author Rachmad Yadyanto
 */
public class Mesin {
    private String JenisMesin;
    private int kecepatanAwal;
    private int kecepatanNow;
    private  boolean status = false;
   
    public Mesin() {
    }

    public Mesin(String JenisMesin, int kecepatanAwal, int kecepatanNow,boolean status) {
        this.JenisMesin = JenisMesin;
        this.kecepatanAwal = kecepatanAwal;
        this.kecepatanNow = kecepatanNow;
        this.status=status;
    }

    public String getJenisMesin() {
        return JenisMesin;
    }

    public void setJenisMesin(String JenisMesin) {
        this.JenisMesin = JenisMesin;
    }
public int getKecepatanAwal() {
        return kecepatanAwal;
    }

    public void setKecepatanAwal(int kecepatanAwal) {
        this.kecepatanAwal = kecepatanAwal;
    }

    public int getKecepatanNow() {
        return kecepatanNow;
    }

    public void setKecepatanNow(int kecepatanNow) {
        this.kecepatanNow = kecepatanNow;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public boolean nyalakanMesin(){
        System.out.println(" Mesin dinyalakan ");
        return this.status=true;
    }
    
    public boolean matikanMesin(){
        System.out.println(" mesin dalam keadaan mati,nyalakan dulu ");
        System.out.println("");
        return this.status=false;
    }
    
    public int tambahKecepatan(boolean status, String jenismesin){
      
        if(status==false){
             System.out.println("motor belum nyala");
        }else{
            if(JenisMesin.equals("honda")){
                kecepatanNow=kecepatanAwal+=10;
                }else if(JenisMesin.equals("yamaha")){
                kecepatanNow=kecepatanAwal+=15;
                }else if(JenisMesin.equals("suzuki")){
                kecepatanNow=kecepatanAwal+=25;
                }else if(JenisMesin.equals("ducati")){
                kecepatanNow=kecepatanAwal+=50;
                }  
            }
        
        return kecepatanNow;
    }
    public int kurangiKecepatan(boolean status, String jenismesin){
        if(status==true){
            
        if(JenisMesin.equals("honda")){
            kecepatanNow=kecepatanAwal-=5;
        }else if(JenisMesin.equals("yamaha")){
            kecepatanNow=kecepatanAwal-=10;
        }else if(JenisMesin.equals("suzuki")){
            kecepatanNow=kecepatanAwal-=15;
        }else if(JenisMesin.equals("ducati")){
            kecepatanNow=kecepatanAwal-=30;
        }
        }
        else{
            System.out.println("motor belum nyala");
        }
        return kecepatanNow;
    }
    
    public void tampilData(){
        System.out.println("jenis mesin         :"+JenisMesin);
        //System.out.println("kecepatan awal "+kecepatanAwal);
        System.out.println("kecepatan sekarang  :"+kecepatanNow);
        
    }

}
