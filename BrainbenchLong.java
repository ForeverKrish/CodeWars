public class BrainbenchLong { 
 private long brainbench; 
 public synchronized void setBrainbench(long brainbench) { 
   this.brainbench = brainbench; 
 } 
 public synchronized long getBrainbench() { 
   return brainbench; 
 } 
} 