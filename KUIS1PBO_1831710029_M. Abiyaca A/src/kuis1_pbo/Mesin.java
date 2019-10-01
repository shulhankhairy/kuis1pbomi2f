package kuis1_pbo;

/**
 *
 * @author Almaarij Muhammad
 */
public class Mesin {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private String merk;

    public Mesin(String merk) {
        this.merk = merk;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public boolean isKontakOn() {
        return kontakOn;
    }

    public void setKontakOn(boolean kontakOn) {
        this.kontakOn = kontakOn;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
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
            if(kecepatan <= 100){
                if(merk == "Honda"){
                    kecepatan +=10;
                }
                else if(merk == "Yamaha"){
                    kecepatan +=15;
                }
                else if(merk == "Suzuki"){
                    kecepatan +=25;
                }
            }
            else{
                System.out.println("Kecepatan sudah mencapai batas maksimal!! \n");
            }
            if(kecepatan <= 200){
                if(merk == "Ducati"){
                    kecepatan +=50;
                }
            }
            else{
                System.out.println("Kecepatan sudah mencapai batas maksimal!! \n");
            }
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }
    
    public void kurangiKecepatan(){
        if(kontakOn == true){
            if(merk == "Honda"){
                kecepatan -=5;
            }
            else if(merk == "Yamaha"){
                kecepatan -=10;
            }
            else if(merk == "Suzuki"){
                kecepatan -=15;
            }
            else if(merk == "Ducati"){
                kecepatan -=30;
            }
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
    
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak On");
            System.out.println("merk : "+merk);
        }
        else{
            System.out.println("Kontak Off");
            System.out.println("merk : "+merk);
        }
        System.out.println("Kecepatan " + kecepatan + " Km/jam");
        System.out.println("-----------------------------");
    }
}
