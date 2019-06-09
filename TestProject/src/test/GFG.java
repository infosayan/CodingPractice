package test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;


public class GFG {
	 public static void main(String[] args)  
	    { 
	        try
	        { 
	            Singleton instance1 = Singleton.instance; 
	            ObjectOutput out  
	                = new ObjectOutputStream(new FileOutputStream("file.text")); 
	            out.writeObject(instance1); 
	            out.close(); 
	          
	            // deserialize from file to object 
	            ObjectInput in  
	                = new ObjectInputStream(new FileInputStream("file.text")); 
	            Singleton instance2 = (Singleton) in.readObject(); 
	            in.close(); 
	          
	            System.out.println("instance1 hashCode:- "
	                                           + instance1.hashCode()); 
	            System.out.println("instance2 hashCode:- "
	                                           + instance2.hashCode()); 
	            
	            Map<String, Test> map = new HashMap<>();
	            Test test = new Test();
	            test.setName("sayan");
	            map.put("a", test);
	            /*test.setName("ssss");
	            map.put(test, "b");
	            test.setName("ffff");
	            map.put(test, "c");
	            map.forEach((K,V) -> System.out.println(K.getName()+" "+V.trim()));*/
	            System.out.println(map);
	            Test test1 = map.get("a");
	            test1.setName("mou");
	            System.out.println(map.get("a"));
	            synchronized (GFG.class) {
					
				}
	        }  
	          
	        catch (Exception e) 
	        { 
	            e.printStackTrace(); 
	        } 
	    }
}
