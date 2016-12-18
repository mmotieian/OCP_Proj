package ch4;

public class Generics1<T> {

	private T t;

	public Generics1(T t) {
		this.t = t;
	}

	<F> void doSomething(F f) {
		System.out.println(f.getClass());
	}

	<F> F doS(F f) {
		return f;
	}

	final T doSome() {
		return t;
	}

	public static void main(String[] args) {
		Generics1<String> str = new Generics1<>("HELLO WORLD");
		str.doSomething("HELLO WORLD");
		System.out.println(str.doSome());
		str.doSomething(123);
		
		System.out.println(str.doS("Mohammad"));
		long num = (long)str.doS(2L) + 4;
		System.out.println(num);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((t == null) ? 0 : t.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Generics1))
			return false;
		Generics1 other = (Generics1) obj;
		if (t == null) {
			if (other.t != null)
				return false;
		} else if (!t.equals(other.t))
			return false;
		return true;
	}
	
	
}
