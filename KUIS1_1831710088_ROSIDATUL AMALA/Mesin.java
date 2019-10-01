/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUIS1;

/**
 *
 * @author asus
 */
public class Mesin {
    private String jnsMesin;
    private int kecepatanAwal;
    private int kecepatanSkr;
    private  boolean status = false;
   
    public Mesin() {
    }

    public Mesin(String jnsMesin, int kecepatanAwal, int kecepatanSkr,boolean status) {
        this.jnsMesin = jnsMesin;
        this.kecepatanAwal = kecepatanAwal;
        this.kecepatanSkr = kecepatanSkr;
        this.status=status;
    }

    public String getJnsMesin() {
        return jnsMesin;
    }

    public void setJnsMesin(String jnsMesin) {
        this.jnsMesin = jnsMesin;
    }

    public int getKecepatanAwal() {
        return kecepatanAwal;
    }

    public void setKecepatanAwal(int kecepatanAwal) {
        this.kecepatanAwal = kecepatanAwal;
    }

    public int getKecepatanSkr() {
        return kecepatanSkr;
    }

    public void setKecepatanSkr(int kecepatanSkr) {
        this.kecepatanSkr = kecepatanSkr;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public boolean nyalakanMesin(){
        System.out.println("Mesin dinyalakan");
        return this.status=true;
    }
    
    public boolean matikanMesin(){
        System.out.println("Mati");
        return this.status=false;
    }
    
    public int tambahKecepatan(boolean status, String jnsmesin){
      
        if(status==false){
             System.out.println("Motor belom nyala");
        }else{
        if(jnsMesin.equals("Honda")){
            kecepatanSkr=kecepatanAwal+=10;
        }else if(jnsMesin.equals("Yamaha")){
            kecepatanSkr=kecepatanAwal+=15;
        }else if(jnsMesin.equals("Suzuki")){
            kecepatanSkr=kecepatanAwal+=25;
        }else if(jnsMesin.equals("Ducati")){
            kecepatanSkr=kecepatanAwal+=50;
        }  
        }
        
        return kecepatanSkr;
    }
    public int kurangiKecepatan(boolean status, String jnsmesin){
        if(status==true){
            
        if(jnsMesin.equals("Honda")){
            kecepatanSkr=kecepatanAwal-=5;
        }else if(jnsMesin.equals("Yamaha")){
            kecepatanSkr=kecepatanAwal-=10;
        }else if(jnsMesin.equals("Suzuki")){
            kecepatanSkr=kecepatanAwal-=15;
        }else if(jnsMesin.equals("Ducati")){
            kecepatanSkr=kecepatanAwal-=30;
        }
        }
        else{
            System.out.println("Motor belom nyala");
        }
        return kecepatanSkr;
    }
    
    public void tampilData(){
        System.out.println("jenismesin "+jnsMesin);
        System.out.println("kecepatan sekarang "+kecepatanSkr);
        
    }
}
