package kuis1_pbo;

/**
 *
 * @author Almaarij Muhammad
 */
public class SepedaMotor {
    public static void main(String[] args) {
        Mesin mtr = new Mesin("Honda");
        Mesin mtr2 = new Mesin("Yamaha");
        Mesin mtr3 = new Mesin("Suzuki");
        Mesin mtr4 = new Mesin("Ducati");
        
        mtr.printStatus();
        mtr.nyalakanMesin();
        
        mtr.tambahKecepatan();
        mtr.printStatus();
        
        mtr.tambahKecepatan();
        mtr.printStatus();
        
        mtr.tambahKecepatan();
        mtr.printStatus();
        
        mtr.tambahKecepatan();
        mtr.printStatus();
        
        mtr.matikanMesin();
        mtr.printStatus();
        System.out.println("");
        
        mtr2.printStatus();
        mtr2.nyalakanMesin();
        
        mtr2.tambahKecepatan();        
        mtr2.printStatus();
        
        mtr2.tambahKecepatan();
        mtr2.printStatus();
        
        mtr2.tambahKecepatan();
        mtr2.printStatus();
        
        mtr2.tambahKecepatan();
        mtr2.printStatus();
        
        mtr2.matikanMesin();
        mtr2.printStatus();
        System.out.println("");
    }
}
