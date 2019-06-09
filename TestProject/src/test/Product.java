package test;

import java.util.Comparator;

class Product implements Comparator<Product>{  
    int id;  
    String name;  
    int price;  
    public Product(int id, String name, int price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
    
    public Product(){
    	
    }
	/*@Override
	public int compareTo(Product o) {
		if(o.name.compareTo(this.name)<1){
			return 1;
		}else if(o.name.compareTo(this.name)>1){
			return -1;
		}
		return 0;
		if(o.id<this.id){
			return 1;
		}else if(o.id>this.id){
			return -1;
		}
		return 0;
	}*/
	@Override
	public int compare(Product o1, Product o2) {
		if(o1.id - o2.id ==0){
			return o1.name.compareTo(o2.name);
		}
		return (o1.id - o2.id);
	}
	
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return ("Id--"+id+" Name--"+name+" Price--"+price);
    }
    
	
} 
