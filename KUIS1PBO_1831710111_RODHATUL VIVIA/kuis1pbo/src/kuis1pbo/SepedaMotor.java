package kuis1pbo;

public class SepedaMotor {
    private String merk;
    private Mesin mesin;
    
    public SepedaMotor(String merk, Mesin mesin){
        this.mesin=mesin;
        this.merk=merk;
    }
    public void setMerk(String merk){
        this.merk=merk;
    }
    public String getMerk(){
        return merk;
    }
    public String getMesin(){
        return mesin.getMerk();
    }
    public void kecepatanMotor(){
        if(mesin.getMerk()=="Honda" && mesin.getMerk()=="Yamaha" && mesin.getMerk()=="Suzuki"){
            if(mesin.getKecepatan()<100){
                System.out.println("Kecepatan sepeda motor normal");
            }
            else if(mesin.getKecepatan()>100){
                System.out.println("Kecepatan melebihi batas maksimum 100km/jam");
            }else{
                System.out.println(mesin.getKecepatan()+"km/jam");
            }   
        }else if(mesin.getMerk()=="Ducati"){
            if(mesin.getKecepatan()>200){
                System.out.println("Kecepatan motor ducati melebihi batas maksimum 200km/jam");
            }
        }
    }
    public void kecepatanMotor2(){
        if(mesin.getKecepatan()==0){
            System.out.println("Kecepatan harus lebih dari 0 km");
        }
    }
    public void print(){
        if(mesin.getKecepatan()<100){
                System.out.println("Kecepatan sepeda motor normal");
        }
        else if(mesin.getKecepatan()>100){
                System.out.println("Kecepatan melebihi batas maksimum");
        }
    }
}
