package Kuis1;

public class MainSepedaMotor {
    public static void main(String[] args) {
        
        Mesin m1 = new Mesin("Honda");
        m1.setMerek("Vario");
        m1.infoMesin();
        m1.mesinNyala();
        m1.tambahKecepatanHonda();
        m1.printStatus();
        m1.tambahKecepatanHonda();
        m1.printStatus();
        m1.kurangiKecepatanHonda();
        m1.printStatus();
        m1.mesinMati();
        m1.printStatus();
        
        System.out.println("");
        Mesin m2 = new Mesin("Yamaha");
        m2.setMerek("NMAX");
        m2.infoMesin();
        m2.mesinNyala();
        m2.tambahKecepatanYamaha();
        m2.printStatus();
        m2.tambahKecepatanYamaha();
        m2.printStatus();
        m2.kurangiKecepatanYamaha();
        m2.printStatus();
        m2.mesinMati();
        m2.printStatus();
        
        System.out.println("");
        Mesin m3 = new Mesin("Suzuki");
        m3.setMerek("Soul GT");
        m3.infoMesin();
        m3.mesinNyala();
        m3.tambahKecepatanSuzuki();
        m3.printStatus();
        m3.tambahKecepatanSuzuki();
        m3.printStatus();
        m3.kurangiKecepatanSuzuki();
        m3.printStatus();
        m3.mesinMati();
        m3.printStatus();
        
        System.out.println("");
        Mesin m4 = new Mesin("Ducati");
        m4.setMerek("Ducati Moto Gp");
        m4.infoMesin();
        m4.mesinNyala();
        m4.tambahKecepatanDucati();
        m4.printStatus();
        m4.tambahKecepatanDucati();
        m4.printStatus();
        m4.kurangiKecepatanDucati();
        m4.printStatus();
        m4.mesinMati();
        m4.printStatus();
        
        }
}
