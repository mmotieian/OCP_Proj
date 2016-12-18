package ch4;

import java.util.ArrayList;
import java.util.List;

import ch7.Car;
import ch7.Engine;
import ch7.Honda;

public class BoundedGeneric<T extends Car> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		BoundedGeneric<Honda> c = new BoundedGeneric<>();
		Honda honda = new Honda();
		Engine engine = new Engine();
		engine.setEngineSize(3);
		honda.setEngine(engine);
		c.setT(honda);

		System.out.println(c.getT());

		List<? super Car> list = new ArrayList<Car>();
		list.add(new Honda());
		list.add(new Car());
		System.out.println("--------------------------");
		for (Object o : list)
			System.out.println(o);
	}

}
