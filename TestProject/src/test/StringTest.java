package test;

public class StringTest {

	@SuppressWarnings("unused")
	private final String value;
	
	StringTest (String value) {
		this.value=value;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println(super.equals(obj));
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		System.out.println(123);
		return 123;
	}
}
