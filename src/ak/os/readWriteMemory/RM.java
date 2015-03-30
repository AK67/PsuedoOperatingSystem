/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ak.os.readWriteMemory;

import ak.os.abstractClasses.AbstractReadWriteMemory;
import ak.os.interfaces.ReadWriteMemory;

/**
 * This will play role of RAM and is singleton
 * @author anubhav.kaushik
 */
public class RM  extends AbstractReadWriteMemory implements ReadWriteMemory{
    
    public static RM Rm = new RM();
    
    private RM()
    {
        this.twoDArrayMemory.memory= new byte[5][10];
        System.out.println("Preparing your RAM........");
    }

    @Override
    public byte[] read(byte memoryIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void write(byte memoryIndex, byte[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static RM getInstance()
    {
        return Rm;
         
    }
    
            
    
      
}
