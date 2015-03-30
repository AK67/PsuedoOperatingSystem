/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ak.os.testComponents.feeder;

import ak.os.readWriteMemory.HDD;
import ak.os.readWriteMemory.RM;

/**
 * class containing static methods to feed some data in memory for testing purposes
 * @author anubhav.kaushik
 */
public class Feeder {
    // HDD FEEDER which will fill 1st row with '1's 
    public static void hddFeeder()
    {  HDD hdd = HDD.getInstance();
       System.out.println("Feeding HDD memory using Test Component");
          for(int i=0;i<9;i++)
          {
              hdd.twoDArrayMemory.memory[0][i]=  1;
          }
    }
    
    public static void rmFeeder()
    {
        RM rm = RM.getInstance();
        System.out.println("Feeding RM memory using Test Component");
        for(int i=0;i<9;i++)
          {
              rm.twoDArrayMemory.memory[0][i]=  1;
          }
    }
    
    
    
}
