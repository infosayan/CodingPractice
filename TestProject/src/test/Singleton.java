package test;
import java.io.Serializable;


class Singleton implements Serializable  
{ 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// public instance initialized when loading the class 
    public static Singleton instance = new Singleton(); 
      
    private Singleton()  
    { 
        // private constructor 
    } 
      
    // implement readResolve method 
    protected Object readResolve() 
    { 
        return instance; 
    } 
    
    public static Singleton getInstance() {
    	synchronized (Singleton.class) {
			
		}
    	return null;
    }
} 
