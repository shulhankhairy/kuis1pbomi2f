/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Mesin {
    public static void main(String[] args){
       SepedaMotor spdmtr = new SepedaMotor("Honda");
       SepedaMotor spdmtr2 = new SepedaMotor("Yamaha");
       SepedaMotor spdmtr3 = new SepedaMotor("Suzuki");
       SepedaMotor spdmtr4 = new SepedaMotor("Ducati");
       
       spdmtr.printStatus();
       spdmtr.tambahKecepatan();
       spdmtr.nyalakanMesin();
       spdmtr.printStatus();
        
       spdmtr.tambahKecepatan();
       spdmtr.printStatus();
        
       spdmtr.tambahKecepatan();
       spdmtr.printStatus();
        
       spdmtr.tambahKecepatan();
       spdmtr.printStatus();
        
       spdmtr.matikanMesin();
       spdmtr.printStatus();
       
       spdmtr2.printStatus();
       spdmtr2.tambahKecepatan();
       spdmtr2.nyalakanMesin();
       spdmtr2.printStatus();
        
       spdmtr2.tambahKecepatan();
       spdmtr2.printStatus();
        
       spdmtr2.tambahKecepatan();
       spdmtr2.printStatus();
        
       spdmtr2.tambahKecepatan();
       spdmtr2.printStatus();
        
       spdmtr2.matikanMesin();
       spdmtr2.printStatus();
       
       spdmtr3.printStatus();
       spdmtr3.tambahKecepatan();
       spdmtr3.nyalakanMesin();
       spdmtr3.printStatus();
        
       spdmtr3.tambahKecepatan();
       spdmtr3.printStatus();
        
       spdmtr3.tambahKecepatan();
       spdmtr3.printStatus();
        
       spdmtr3.tambahKecepatan();
       spdmtr3.printStatus();
        
       spdmtr3.matikanMesin();
       spdmtr3.printStatus();
       
       
       spdmtr4.printStatus();
       spdmtr4.tambahKecepatan();
       spdmtr4.nyalakanMesin();
       spdmtr4.printStatus();
        
       spdmtr4.tambahKecepatan();
       spdmtr4.printStatus();
        
       spdmtr4.tambahKecepatan();
       spdmtr4.printStatus();
        
       spdmtr4.tambahKecepatan();
       spdmtr4.printStatus();
        
       spdmtr4.matikanMesin();
       spdmtr4.printStatus();
    }

    
}
