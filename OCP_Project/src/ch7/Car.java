/**
 * 
 */
package ch7;

import java.io.Serializable;

/**
 * @author Mohammad Najar
 *
 */
public class Car implements Serializable, Comparable<Car> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String owner;
	private Car instance;
	private Engine engine;

	public Car() {
		super();
	}

	public Car(String owner) {
		super();
		this.owner = owner;
	}

	public Car(String str, Car instance, Engine engine) {
		this.owner = str;
		this.instance = instance;
		this.engine = engine;
	}

	public String getStr() {
		return owner;
	}

	public Car getInstance() {
		return instance;
	}

	public void setInstance(Car instance) {
		this.instance = instance;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [str=" + owner + ", instance=" + instance + ", engine=" + engine + "]";
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.owner.compareTo(o.owner);
	}

	@Override
	public boolean equals(Object car) {
		// TODO Auto-generated method stub
		if (car instanceof Car)
			return this.owner.equals(((Car) car).getStr());
		return false;
	}

}
