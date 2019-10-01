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
public class MainSepedaMotor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SepedaMotor motor = new SepedaMotor();
        motor.mesin.setMerk("Honda");
        motor.nyalakanMotor();
        System.out.println("Merk Sepeda Motor : "+motor.mesin.getMerk());
        System.out.println("Kecepatan awal : "+motor.mesin.getV());
        System.out.println("Tambah Kecepatan");
        motor.mesin.tambahKecepatan();
        System.out.println(motor.mesin.detail());
        motor.mesin.tambahKecepatan();
        System.out.println(motor.mesin.detail());
        System.out.println("Kurangi Keceptan");
        motor.mesin.kurangKecepatan();
        System.out.println(motor.mesin.detail());
        motor.mesin.kurangKecepatan();
        System.out.println(motor.mesin.detail());
        motor.matikanMotor();
        System.out.println(motor.mesin.detail());
        
        
        
        
    }
    
}
