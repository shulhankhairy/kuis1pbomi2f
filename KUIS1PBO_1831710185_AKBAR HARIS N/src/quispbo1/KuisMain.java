/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quispbo1;

/**
 *
 * @author ASUS
 */
public class KuisMain {
    public static void main(String[] args) {
 
        Mesin mtr1 = new Mesin("Honda");
        Mesin mtr2 = new Mesin("Yamaha");
        Mesin mtr3 = new Mesin("Suzuki");
        Mesin mtr4 = new Mesin("Ducati");
        
        SepedaMotor sep1 = new SepedaMotor("Honda",mtr1);
        SepedaMotor sep2 = new SepedaMotor("Yamaha",mtr2);
        SepedaMotor sep3 = new SepedaMotor("Suzuki",mtr3);
        SepedaMotor sep4 = new SepedaMotor("Ducati",mtr4);
        
        mtr1.nyalakanMesin();
        sep1.tambahKecepatan();
        sep1.kurangiKecepatan();
        sep1.printStatus();
        
        mtr2.nyalakanMesin();
        sep2.tambahKecepatan();
        sep2.kurangiKecepatan();
        sep2.printStatus();
        
        
        mtr3.nyalakanMesin();
        sep3.tambahKecepatan();
        sep3.kurangiKecepatan();
        sep3.printStatus();
        
        
        mtr4.nyalakanMesin();
        sep4.tambahKecepatan();
        sep4.kurangiKecepatan();
        sep4.printStatus();
        
        
        
        
    
        
        
       
    }
}
