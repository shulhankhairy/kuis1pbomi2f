package kuis1pbo;
//import java.util.Scanner;
public class MotorDemo {
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
     
        Mesin ms1 = new Mesin("Honda", "Scoopy");
        ms1.getMerk();
        ms1.getTipe();
        ms1.nyalakanMesin();
        ms1.nyalakanMotor();
        ms1.tambahKecepatan();
        ms1.tambahKecepatan();
        ms1.tambahKecepatan();
        ms1.kurangiKecepatan();
        ms1.printInfo();
        ms1.printStatus();
        SepedaMotor mt1 = new SepedaMotor("Honda", ms1);
        mt1.getMerk();
        mt1.getMesin();
        ms1.getKecepatan();
        mt1.kecepatanMotor();
        mt1.print();
        System.out.println("========================================");
        
        Mesin ms2 = new Mesin("Yamaha", "Mio");
        ms2.getMerk();
        ms2.getTipe();
        ms2.nyalakanMesin();
        ms2.nyalakanMotor();
        ms2.tambahKecepatan();
        ms2.tambahKecepatan();
        ms2.tambahKecepatan();
        ms2.kurangiKecepatan();
        ms2.printInfo();
        ms2.printStatus();
        SepedaMotor mt2 = new SepedaMotor("Yamaha", ms2);
        mt2.getMerk();
        mt2.getMesin();
        ms2.getKecepatan();
        mt2.kecepatanMotor();
        mt2.print();
        System.out.println("========================================");

        Mesin ms3 = new Mesin("Suzuki", "Satria");
        ms3.getMerk();
        ms3.getTipe();
        ms3.nyalakanMesin();
        ms3.nyalakanMotor();
        ms3.tambahKecepatan();
        ms3.tambahKecepatan();
        ms3.tambahKecepatan();
        ms3.tambahKecepatan();
        ms3.tambahKecepatan();
        ms3.kurangiKecepatan();
        ms3.printInfo();
        ms3.printStatus();
        SepedaMotor mt3 = new SepedaMotor("Suzuki", ms3);
        mt3.getMerk();
        mt3.getMesin();
        ms3.getKecepatan();
        mt3.kecepatanMotor();
        mt3.print();
        System.out.println("========================================");

        Mesin ms4 = new Mesin("Ducati", "Ducati 1500");
        ms4.getMerk();
        ms4.getTipe();
        ms4.nyalakanMesin();
        ms4.nyalakanMotor();
        ms4.tambahKecepatan();
        ms4.tambahKecepatan();
        ms4.tambahKecepatan();
        ms4.tambahKecepatan();
        ms4.tambahKecepatan();
        ms4.kurangiKecepatan();
        ms4.printInfo();
        ms4.printStatus();
        SepedaMotor mt4 = new SepedaMotor("Ducati", ms4);
        mt4.getMerk();
        mt3.getMesin();
        ms3.getKecepatan();
        mt3.kecepatanMotor();
        mt3.print();

    }
}