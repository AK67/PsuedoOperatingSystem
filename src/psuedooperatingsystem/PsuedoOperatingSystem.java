/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psuedooperatingsystem;

import ak.os.readWriteMemory.HDD;
import ak.os.testComponents.feeder.Feeder;
import ak.os.testComponents.memoryDisplay.MemoryDisplay;

/**
 *
 * @author anubhav.kaushik
 */
public class PsuedoOperatingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HDD Hdd = HDD.getInstance( );
        // Feeder.hddFeeder();
        //MemoryDisplay.HDDMemoryDisplay();
    }
}


