/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.Kuis1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DynoTest {
    public static void main(String[]args)
    {
        SepedahMotor spd = new SepedahMotor();
        Scanner sc = new Scanner(System.in);
        char ch;
        String merk;
        
        System.out.println("MOTO LIST :");
        System.out.println(" == Honda ==");
        System.out.println(" == Yamaha ==");
        System.out.println(" == Suzuki ==");
        System.out.println(" == Ducati ==");
        System.out.print("Type Moto Merk on the list : ");
        merk = sc.nextLine();
        do
        {                  
            System.out.println("MOTO DYNO TEST");          
            spd.setMerk(merk); 
            System.out.println("");
            System.out.println("1. Motorcycle and Engine Status");
            System.out.println("2. Tambah kecepatan");
            System.out.println("3. Kurangi kecepatan");
            System.out.println("4. End Dyno test - Turning OFF motorcycle");
            System.out.println("");
                
            int pilihan = sc.nextInt();
            switch(pilihan)
            {
                case 1:
                    if(spd.getStatus())
                    {                        
                        System.out.println("Engine status : OFF");
                        System.out.println("Turning On Engine");                        
                        spd.engine.setStauts(true);
                        System.out.println("Ready To Go");
                        break;
                    }
                    else
                    {
                        System.out.println("Motorcycle status : off ");
                        System.out.println("");
                        System.out.println("Turning On motorcycle");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println(".");
                        System.out.println("Hello sir");
                        System.out.println("Motorcycle status : On");
                        spd.setStatus(true);                        
                        break;
                    }
                case 2:
                    if(spd.engine.getStatus() && spd.getStatus())
                    {
                        if(!spd.getMerk().equalsIgnoreCase("ducati"))
                        {
                            if(spd.engine.getKecepatan() < 100)
                            {
                                spd.incSpeed();
                                System.out.println("Speed right now : "+ spd.engine.info());
                                break;
                            }   
                            else
                                System.out.println("Your limit speed at Maximum");
                                break;
                        }
                        else
                        {
                            if(spd.engine.getKecepatan() < 200)
                            {
                                spd.incSpeed();
                                System.out.println("Speed right now : "+ spd.engine.info());
                                break;
                            }
                            else
                            {
                                System.out.println("Your limit speed at Maximum");
                                break;
                            }
                        }
                    }
                    else
                    {                        
                        System.out.println("You should turning on Engine");
                        break;
                    }
                case 3:
                    if(spd.engine.getKecepatan() != 0)
                    {
                        spd.decSpeed();
                        System.out.println("Speed right now : "+ spd.engine.info());
                        break;
                    }
                    else
                    {
                        System.out.println("Limit minimum speed : 0 ");
                        break;
                    }
                case 4:
                    System.out.println("Turning OFF motorcycle");
                    spd.engine.setStauts(false);
                    spd.setStatus(false);
                    spd.engine.resetSpeed();                    
                    break;
                default:
                    System.out.println("Masukkan Sesuai pilihan yang ada");
                    break;
            }               
            System.out.println("\nContinue ? (Y/T) \n");
            ch = sc.next().charAt(0);            
        }while(ch == 'Y' || ch == 'y');
    }    
}
