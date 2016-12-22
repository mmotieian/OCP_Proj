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
	private String str;
	private Car instance;
	private Engine engine;

	public Car() {
		str = "he";
		this.instance = null;
	}

	public Car(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
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
		// TODO Auto-generated method stub
		return this.str;
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.str.compareTo(o.str);
	}

	@Override
	public boolean equals(Object car) {
		// TODO Auto-generated method stub
		if (car instanceof Car)
			return this.str.equals(((Car) car).getStr());
		return false;
	}

}
