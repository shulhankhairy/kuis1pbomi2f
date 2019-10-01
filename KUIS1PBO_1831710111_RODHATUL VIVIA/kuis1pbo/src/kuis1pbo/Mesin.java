package kuis1pbo;

public class Mesin {
    private String merk;
    private String tipe;
    private int kecepatan=0;
    private boolean kontakOn = false;
    private boolean motorOn=false;
    
    public Mesin(String merk, String tipe){
        this.merk=merk;
        this.tipe=tipe;
    }
    public void setMerk(String merk){
        this.merk=merk;
    }
    public String getMerk(){
        return merk;
    }
    public void setTipe(String tipe){
        this.tipe=tipe;
    }
    public String getTipe(){
        return tipe;
    }
    public int getKecepatan(){
        return kecepatan;
    }
    public void nyalakanMesin(){
        kontakOn=true;
    }
    public void nyalakanMotor(){
        motorOn=true;
    }
    public void matikanMotor(){
        motorOn=false;
    }
    public void matikanMesin(){
        kontakOn=false;
        kecepatan=0;
    }
    public void tambahKecepatan(){
        if(kontakOn==true && motorOn==true){
            if(merk=="Honda"){
                kecepatan+=10;
            }
            else if(merk=="Yamaha"){
                kecepatan+=15;
            }
            else if(merk=="Suzuki"){
                kecepatan+=25;
            }
            else{
                kecepatan+=50;
            }
        }
    }
    
    public void kurangiKecepatan(){
        if(kontakOn==true){
            if(merk=="Honda"){
                kecepatan-=5;
            }
            else if(merk=="Yamaha"){
                kecepatan-=10;
            }
            else if(merk=="Suzuki"){
                kecepatan-=15;
            }
            else{
                kecepatan-=30;
            }
        }
    }
    public void printInfo(){
        System.out.println("Merk Motor: " + merk);
        System.out.println("Tipe Motor: " + tipe);
    }
    public void printStatus(){
        if(kontakOn==true && motorOn==true){
            System.out.println("Kecepatan sepeda motor saat ini " + kecepatan+ " km/jam");
        }
        else if(kontakOn==false){
            System.out.println("Sepeda motor tidak dapat melakukan penambahan kecepatan!");
        }
        else if(kontakOn==true && motorOn==false){
            System.out.println("Sepeda motor harus dinyalakan terlebih dahulu!");
        }    
        
    }

}
