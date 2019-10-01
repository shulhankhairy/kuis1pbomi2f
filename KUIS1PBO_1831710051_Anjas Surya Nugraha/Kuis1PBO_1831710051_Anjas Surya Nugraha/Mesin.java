package KuisPertama;

public class Mesin {
   private String jenisMesin;
    private int kecepatanAwal;
    private int kecepatanNow;
    private  boolean status = false;
   
    public Mesin() {
    }

    public Mesin(String jnsMesin, int kecepatanAwal, int kecepatanNow,boolean status) {
        this.jenisMesin = jnsMesin;
        this.kecepatanAwal = kecepatanAwal;
        this.kecepatanNow = kecepatanNow;
        this.status=status;
    }

    public String getJenisMesin() {
        return jenisMesin;
    }

    public void setJenisMesin(String jnsMesin) {
        this.jenisMesin = jnsMesin;
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
        System.out.println("Mesin Dinyalakan");
        return this.status=true;
    }
    
    public boolean matikanMesin(){
        System.out.println("Mati");
        return this.status=false;
    }
    
    public int tambahKecepatan(boolean status, String jnsmesin){
      
        if(status==false){
             System.out.println("Motor Belum nyala");
        }else{
        if(jenisMesin.equals("Honda")){
            kecepatanNow=kecepatanAwal+=10;
        }else if(jenisMesin.equals("Yamaha")){
            kecepatanNow=kecepatanAwal+=15;
        }else if(jenisMesin.equals("Suzuki")){
            kecepatanNow=kecepatanAwal+=25;
        }else if(jenisMesin.equals("dDucati")){
            kecepatanNow=kecepatanAwal+=50;
        }  
        }
        
        return kecepatanNow;
    }
    public int kurangiKecepatan(boolean status, String jnsmesin){
        if(status==true){
            
        if(jenisMesin.equals("Honda")){
            kecepatanNow=kecepatanAwal-=5;
        }else if(jenisMesin.equals("Yamaha")){
            kecepatanNow=kecepatanAwal-=10;
        }else if(jenisMesin.equals("Suzuki")){
            kecepatanNow=kecepatanAwal-=15;
        }else if(jenisMesin.equals("Ducati")){
            kecepatanNow=kecepatanAwal-=30;
        }
        }
        else{
            System.out.println("Motor Belum Nyala");
        }
        return kecepatanNow;
    }
    
    public void tampilData(){
        System.out.println("Jenis Mesin "+jenisMesin);
        //System.out.println("kecepatan awal "+kecepatanAwal);
        System.out.println("Kecepatan Sekarang "+kecepatanNow);
        
    }
}