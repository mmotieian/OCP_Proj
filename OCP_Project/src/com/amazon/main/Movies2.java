package com.amazon.main;

import java.util.Arrays;
import java.util.Comparator;

public class Movies2 implements Comparator<Movies2> {

	private int age;
	private String name;

	public Movies2() {

	}

	public Movies2(int age, String... name) {
		this.age = age;
		this.name = name.length < 1 ? null : name[0];

	}

	public static void main(String[] args) {

		Movies2[] movies = { new Movies2(5), new Movies2(4) };

		System.out.println(Arrays.asList(movies));
		Arrays.sort(movies, new Movies2());

		System.out.println(Arrays.asList(movies));
	}

	@Override
	public String toString() {
		return "Movies [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movies2 other = (Movies2) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compare(Movies2 o1, Movies2 o2) {
		// TODO Auto-generated method stub
		return o1.age > o2.age ? 1 : -1;
	}

}
