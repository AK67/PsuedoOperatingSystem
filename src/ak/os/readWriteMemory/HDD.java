
package ak.os.readWriteMemory;

import ak.os.abstractClasses.AbstractReadWriteMemory;
import ak.os.interfaces.ReadWriteMemory;

/**
 * This is supposed to play role of HardDisk and it will be singleton
 * @author anubhav.kaushik
 */
public class HDD extends AbstractReadWriteMemory implements ReadWriteMemory {
    
    
   private static HDD Hdd = new HDD();
  
    private HDD()
    { 
         this.twoDArrayMemory.memory= new byte[20][10];
         // print that it has been initialized 
         System.out.println("Preparing Your Hard Disk......");
    }    
    /**
     *
     * @param memoryIndex index where read operation need to be made
     * @return byte array after removing the first two bytes reserved for address
     */
    @Override
    public byte[] read(byte memoryIndex) {
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param memoryIndex index where read operation need to be made
     * @param data which need to be written 
     */
    @Override
    public void write(byte memoryIndex, byte[] data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
     /**
     *
     * @return instance of HDD object
     */
       public static HDD getInstance( ) {
       return Hdd;
      
   }

}
