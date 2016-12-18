package ch7;

public class Honda extends Car {

	public Honda() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a " + Honda.class.getName() + super.toString();
	}
}
