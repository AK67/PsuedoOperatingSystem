/*
 * 
 */
package ak.os.interfaces;

/**
 * Every class that implements this must provide with proper read and write operations
 * @author anubhav.kaushik
 */
public interface ReadWriteMemory {
    // Return the array of bytes on given memory index 

    /**
     *
     * @param memoryIndex index where read operation need to be done
     * @return byte array after removing the first two bytes reserved for address
     */
        public byte[] read(byte memoryIndex);

    /**
     *
     * @param memoryIndex should be of 2 digit ,write 01 for 1
     * @param data which need to be written 
     */
    public void write(byte memoryIndex, byte[] data);    
    
    //Default method as introduced in JAva8
    default public void newDefaultMethod() {
            System.out.println("Initializing.......");
        }
}
