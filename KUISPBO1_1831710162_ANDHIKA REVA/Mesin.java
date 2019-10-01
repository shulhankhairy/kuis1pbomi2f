/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andhika
 */
public class Mesin {
    private String jnsMesin;
    private int speedAwal;
    private int speedCur;
    private  boolean status = false;
   
    public Mesin() {
    }

    public Mesin(String jnsMesin, int speedAwal, int speedCur,boolean status) {
        this.jnsMesin = jnsMesin;
        this.speedAwal = speedAwal;
        this.speedCur = speedCur;
        this.status=status;
    }

    public String getJnsMesin() {
        return jnsMesin;
    }

    public void setJnsMesin(String jnsMesin) {
        this.jnsMesin = jnsMesin;
    }

    public int getspeedAwal() {
        return speedAwal;
    }

    public void setspeedAwal(int speedAwal) {
        this.speedAwal = speedAwal;
    }

    public int getspeedCur() {
        return speedCur;
    }

    public void setspeedCur(int speedCur) {
        this.speedCur = speedCur;
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
        System.out.println("mati");
        return this.status=false;
    }
    
    public int tambahSpeed(boolean status, String jnsmesin){
      
        if(status==false){
             System.out.println("motor belom nyala :p");
        }else{
        if(jnsMesin.equals("honda")){
            speedCur=speedAwal+=10;
        }else if(jnsMesin.equals("yamaha")){
            speedCur=speedAwal+=15;
        }else if(jnsMesin.equals("suzuki")){
            speedCur=speedAwal+=25;
        }else if(jnsMesin.equals("ducati")){
            speedCur=speedAwal+=50;
        }  
        }
        
        return speedCur;
    }
    public int kurangiSpeed(boolean status, String jnsmesin){
        if(status==true){
            
        if(jnsMesin.equals("honda")){
            speedCur=speedAwal-=5;
        }else if(jnsMesin.equals("yamaha")){
            speedCur=speedAwal-=10;
        }else if(jnsMesin.equals("suzuki")){
            speedCur=speedAwal-=15;
        }else if(jnsMesin.equals("ducati")){
            speedCur=speedAwal-=30;
        }
    }
        else{
            System.out.println("motor belom nyala :p");
        }
        return speedCur;
    }
    
    public void tampilData(){
        System.out.println("Jenis Mesin: "+jnsMesin);
        System.out.println("Kecepatan Sekarang: "+speedCur);
        
    }
}
