package ch2;

public abstract class AbstractImpl extends AbstractClass implements MainInterface {

	public static String s = "";
	public AbstractImpl() {
		super(2);
	}
	
	public abstract void doSomthing1();

}
