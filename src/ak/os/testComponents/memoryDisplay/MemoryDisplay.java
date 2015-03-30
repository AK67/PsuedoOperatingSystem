
package ak.os.testComponents.memoryDisplay;

import ak.os.readWriteMemory.HDD;

/**
 * class containing display contents of memory in two dimensional array
 * @author anubhav.kaushik
 */
public class MemoryDisplay {
    
    public static void HDDMemoryDisplay()
    {  
        System.out.println("Dispalying HDD MEMORY !!!!!");
         HDD hdd = HDD.getInstance();
         for(int rownum=0 ;rownum<20 ;rownum++)
         {   System.out.println("----------------------------");
               for(int colnum =0;colnum<10;colnum++)
               {   
                   System.out.print("|");
                   System.out.print(hdd.twoDArrayMemory.memory[rownum][colnum]);
                   System.out.print("|");                   
               }
              System.out.println("");
         }  
        System.out.println("END OF HDD MEMORY Display !!!!!");
    }
    
}
