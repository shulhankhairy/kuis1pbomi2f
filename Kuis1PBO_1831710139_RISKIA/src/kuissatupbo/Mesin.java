/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuissatupbo;

/**
 *
 * @author toshiba
 */
public class Mesin {
    private String merk;
    private int v=0;
    private boolean mesin=false;
//    private boolean motor=false;

    public Mesin(String merk) {
        this.merk = merk;
    }

    public Mesin() {
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
    
    public boolean nyalakanMesin(){
        mesin=true;
        return mesin;
    }
    
//    public boolean nyalakanMotor(){
//        motor=true;
//        return motor;
//    }
    
    public int tambahKecepatan(){
        if (mesin != true) {
            System.out.println("Nyalakan Mesin Terlebih Dahulu");
            this.nyalakanMesin();
        }else if(mesin == true){
                switch(merk){
                    case "Honda":
                    case "honda":
                        if (v >= 100) {
                            System.out.println("Kecepatan melampaui batas.\nKecepatan max 100km/jam");
                        }else if(v < 100){
                            v += 10;
                        }
                        break;
                    case "yamaha":
                    case "Yamaha":
                        if (v >= 100) {
                            System.out.println("Kecepatan melampaui batas.\nKecepatan max 100km/jam");
                        }else if(v < 100){
                            v += 15;
                        }
                        break;
                    case "suzuki":
                    case "Suzuki":
                        if (v >= 100) {
                            System.out.println("Kecepatan melampaui batas.\nKecepatan max 100km/jam");
                        }else if(v < 100){
                            v += 25;
                        }
                        break;
                    case "ducati":
                    case "Ducati":
                        if (v >= 200) {
                            System.out.println("Kecepatan melampaui batas.\nKecepatan max 100km/jam");
                        }else if(v < 200){
                            v += 50;
                        }
                        break;
                }
            }
        
        return v;
    }
    
    public int kurangKecepatan(){
        switch(merk){
                    case "Honda":
                    case "honda":
                        if (v > 0) {
                            v -= 5;
                        }else if(v <= 0){
                            System.out.println("Tambah kecepatan anda");
                        }
                        break;
                    case "yamaha":
                    case "Yamaha":
                        if (v > 0) {
                            v -= 10;
                        }else if(v <= 0){
                            System.out.println("Tambah kecepatan anda");
                        }
                        break;
                    case "suzuki":
                    case "Suzuki":
                        if (v > 0) {
                            v -= 15;
                        }else if(v <= 0){
                            System.out.println("Tambah kecepatan anda");
                        }
                        break;
                    case "ducati":
                    case "Ducati":
                        if (v > 0) {
                            v -= 30;
                        }else if(v <= 0){
                            System.out.println("Tambah kecepatan anda");
                        }
                        break;
                }
        return v;
    }
    
    public boolean matikanMesin(){
        // this.matikanMotor();
        v = 0;
        mesin = false;
        return mesin;
    }
    
//    public boolean matikanMotor(){
//        motor = false;
//        return motor;
//    }
    public String detail(){
        String detail = "";
        detail += "Kecepatan : "+this.getV()+"km/jam";
        return detail;
    }
}
