package ch4;

import java.util.ArrayList;
import java.util.List;

public class Parcel<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {

		Parcel<String> parcel0 = new Parcel<String>();

		// Incorrect number of arguments for type Parcel<T>; it cannot be
		// parameterized with arguments <>
		// Parcel<> parcel1 = new Parcel<String>();

		Parcel<String> parcel2 = new Parcel<>();
		parcel2.setT("asdf");
		String s = parcel2.getT();

		Parcel<String> parcel3 = new Parcel(); // Warning
		parcel3.setT("asdf");
		s = parcel3.getT();

		Parcel parcel4 = new Parcel<String>();
		parcel4.setT("asdf");
		// s = parcel4.getT(); // Type mismatch: cannot convert from Object to
		// String

		Parcel<String> parcel5 = new Parcel(); // Warning
		parcel5.setT("asdf");
		s = parcel5.getT();

		List list = new ArrayList<String>();
		list.add("s");
		// s = list.get(0);

	}
}