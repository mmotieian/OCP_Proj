/**
 * 
 */
package ch7;

import java.io.Serializable;

/**
 * @author Mohammad Najar
 *
 */
public class Car implements Serializable {

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

}
