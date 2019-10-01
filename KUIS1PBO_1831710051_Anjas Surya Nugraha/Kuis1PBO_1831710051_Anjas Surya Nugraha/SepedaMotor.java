package KuisPertama;

public class SepedaMotor {
    public static void main(String[] args) {
        Mesin honda = new Mesin ();
        honda.setJenisMesin("Honda");
        honda.setKecepatanAwal(0);
        //honda.nyalakanMesin();
        honda.matikanMesin();
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println("");
        honda.nyalakanMesin();
        honda.tambahKecepatan(honda.isStatus(),honda.getJenisMesin());
        honda.tampilData();
        System.out.println("");
        honda.kurangiKecepatan(honda.isStatus(),honda.getJenisMesin());
        //honda.tambahKecepatan();
        honda.tampilData();
    }
}