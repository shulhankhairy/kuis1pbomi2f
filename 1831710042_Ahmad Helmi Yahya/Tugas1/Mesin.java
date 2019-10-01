/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
public class Mesin {
    private String JenisMesin;
    private int kecepatanAwal;
    private int kecepatanSekarang;
    private  boolean status = false;
   
    public Mesin() {
    }

    public Mesin(String JenisMesin, int kecepatanAwal, int kecepatanSekarang,boolean status) {
        this.JenisMesin = JenisMesin;
        this.kecepatanAwal = kecepatanAwal;
        this.kecepatanSekarang = kecepatanSekarang;
        this.status=status;
    }
    
    public int tambahKecepatan(boolean status, String jenismesin){
      
        if(status==false){
             System.out.println("Motor Belum Menyala");
        }else{
        if(JenisMesin.equals("Honda")){
            kecepatanSekarang=kecepatanAwal+=10;
        }else if(JenisMesin.equals("Yamaha")){
            kecepatanSekarang=kecepatanAwal+=15;
        }else if(JenisMesin.equals("Suzuki")){
            kecepatanSekarang=kecepatanAwal+=25;
        }else if(JenisMesin.equals("Ducati")){
            kecepatanSekarang=kecepatanAwal+=50;
        }  
        }
        
        return kecepatanSekarang;
    }
    public int kurangiKecepatan(boolean status, String jnsmesin){
        if(status==true){
            
        if(JenisMesin.equals("Honda")){
            kecepatanSekarang=kecepatanAwal-=5;
        }else if(JenisMesin.equals("Yamaha")){
            kecepatanSekarang=kecepatanAwal-=10;
        }else if(JenisMesin.equals("Suzuki")){
            kecepatanSekarang=kecepatanAwal-=15;
        }else if(JenisMesin.equals("Ducati")){
            kecepatanSekarang=kecepatanAwal-=30;
        }
        }
        else{
            System.out.println("Motor Belum Menyala");
        }
        return kecepatanSekarang;
    }
    
    public String getJenisMesin() {
        return JenisMesin;
    }
      public int getKecepatanSekarang() {
        return kecepatanSekarang;
    }

    public void setKecepatanNow(int kecepatanNow) {
        this.kecepatanSekarang = kecepatanSekarang;
    }

    public void setJenisMesin(String JenisMesin) {
        this.JenisMesin = JenisMesin;
    }
    
    public void setKecepatanAwal(int kecepatanAwal) {
        this.kecepatanAwal = kecepatanAwal;
    }

  
    public int getKecepatanAwal() {
        return kecepatanAwal;
    }

    
    public boolean Status() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public boolean nyalakanMesin(){
        System.out.println(" Mesin Dinyalakan ");
        return this.status=true;
    }
    
    public boolean matikanMesin(){
        System.out.println(" Matikan Mesin ");
        System.out.println("");
        return this.status=false;
    }
    
    
    
    public void tampilData(){
        System.out.println("jenis mesin "+JenisMesin);
        System.out.println("kecepatan sekarang "+kecepatanSekarang);
        
    }

}

