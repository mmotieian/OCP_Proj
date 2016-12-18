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
	static private String str;
	private Car instance;
	private Engine engine;

	public Car() {
		// TODO Auto-generated constructor stub
		str = "he";
		this.instance = null;
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
		return " and the engine size is : " + ((null == engine) ? "undefined" : "" + engine.getEngineSize());
	}

	
	
}
