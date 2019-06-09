package test;

@FunctionalInterface
public interface Functional {

	default void add() {
		
	}
	
	static void sub() {
		
	}
	
	abstract String div(String a);
	//abstract void mult();
}
