package Sepeda;

public class Main {
    public static void main(String[] args) {
        Mesin msn1 = new Mesin("Ducati");
        msn1.nyalakanMesin();
        
        SepedaMotor spd1 = new SepedaMotor("dd", msn1);
        
        
        spd1.tambahKecepatan();
        spd1.printStatus();
        spd1.tambahKecepatan();
        spd1.printStatus();
        spd1.tambahKecepatan();
        spd1.printStatus();
        spd1.tambahKecepatan();
        spd1.printStatus();
        spd1.tambahKecepatan();
        spd1.printStatus();
        spd1.kurangiKecepatan();
        spd1.printStatus();
        msn1.matikanMesin();
        spd1.printStatus();
        
        
    }
}
