package test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainTest {

	public static void main(String[] args) {
		 List<Employee> employeeList = new ArrayList<Employee>();  
		 List<Address> addressList = new ArrayList<Address>();
		 
		 addressList.add(new Address("Bangalore", "560066"));
		 addressList.add(new Address("Kolkata", "700008"));
		 
		 employeeList.add(new Employee("1","Sayan",addressList));  
		 
		 addressList = new ArrayList<Address>();
		 addressList.add(new Address("Dhanbad", "340007"));
		 addressList.add(new Address("Mumbai", "400006"));   
		 
		 employeeList.add(new Employee("2","Rocky",addressList));  
		 
		 /*employeeList.forEach(e -> System.out.println("Name "+e.getName()+
				 " City "+e.getAddress().stream()
				 .map(a -> a.getCity()).collect(Collectors.toList())));*/
		 
		 // using flatmap
		 
		 //System.out.println(employeeList);
		 
		 //reverse("samit");
		 
		 int a [] = {3,2,4,5,8,9};
		 addElements(a);
	}
	
	public static void reverse(String str) {
		if(str==null || str.length()<=1) 
		{
			System.out.println(str);
		}
		else
		{
			System.out.print(str.charAt(str.length()-1));
		 	reverse(str.substring(0,str.length()-1));
		}
	}
	
	public static void addElements(int str []){
		List<Integer> eleList = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			eleList.add(str[i]);
			System.out.println("List after add ::"+eleList);
			eleList.remove(new Integer(str[i]));
			System.out.println("List after remove ::"+eleList);
			//System.out.println(str[i]);
			System.out.println("Removed element ::"+str[i]);
			System.out.println("==========================");
		}
		
	}
}
