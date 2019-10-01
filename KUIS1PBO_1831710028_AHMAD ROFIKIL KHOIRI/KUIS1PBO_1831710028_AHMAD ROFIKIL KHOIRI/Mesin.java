/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quis1;

/**
 *
 * @author HP TEVAN
 */
public class Mesin {
    private String jenisMesin;
    private int kecepatanAwal;
    private int kecepatanSkrg;
    private boolean status = false;
    
    public Mesin(){
        
    }

    public Mesin(String jenisMesin, int kecepatanAwal, int kecepatanSkrg) {
        this.jenisMesin = jenisMesin;
        this.kecepatanAwal = kecepatanAwal;
        this.kecepatanSkrg = kecepatanSkrg;
        this.status = status;
    }

    public String getJenisMesin() {
        return jenisMesin;
    }

    public void setJenisMesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }

    public int getKecepatanAwal() {
        return kecepatanAwal;
    }

    public void setKecepatanAwal(int kecepatanAwal) {
        this.kecepatanAwal = kecepatanAwal;
    }

    public int getKecepatanSkrg() {
        return kecepatanSkrg;
    }

    public void setKecepatanSkrg(int kecepatanSkrg) {
        this.kecepatanSkrg = kecepatanSkrg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
     public boolean nyalakanMesin(){
        System.out.println("Mesin menyala");
        return this.status=true;
    }
    
    public boolean matikanMesin(){
        System.out.println("Motor mati");
        return this.status=false;
    }
    
    public int tambahKecepatan(boolean status, String jnsmesin){
      
        if(status==false){
             System.out.println("Mesin belum dinyalakan");
        }else{
        if(jenisMesin.equals("Honda")){
            kecepatanSkrg = kecepatanAwal +=10;
        }else if(jenisMesin.equals("Yamaha")){
            kecepatanSkrg = kecepatanAwal +=15;
        }else if(jenisMesin.equals("Suzuki")){
            kecepatanSkrg = kecepatanAwal +=25;
        }else if(jenisMesin.equals("Ducati")){
            kecepatanSkrg = kecepatanAwal +=50;
            }  
        }
        return kecepatanSkrg;
    }
    public int kurangiKecepatan(boolean status, String jnsmesin){
        if(status==true){
            
        if(jenisMesin.equals("Honda")){
            kecepatanSkrg = kecepatanAwal -=5;
        }else if(jenisMesin.equals("Yamaha")){
            kecepatanSkrg = kecepatanAwal -=10;
        }else if(jenisMesin.equals("Suzuki")){
            kecepatanSkrg = kecepatanAwal -=15;
        }else if(jenisMesin.equals("Ducati")){
            kecepatanSkrg = kecepatanAwal -=30;
            }
        }
        else{
            System.out.println("motor belum nyala");
        }
        return kecepatanSkrg;
    }
    
    public void tampilData(){
        System.out.println("Jenis Mesin        : " + jenisMesin);
        //System.out.println("Kecepatan Awal     : " + kecepatanAwal);
        System.out.println("Kecepatan Sekarang : " + kecepatanSkrg);
    }
}