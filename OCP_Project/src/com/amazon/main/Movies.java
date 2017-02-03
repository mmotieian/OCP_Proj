package com.amazon.main;

import java.util.Arrays;

public class Movies implements Comparable<Movies> {

	private int age;
	private String name;

	public Movies(int age, String... name) {
		this.age = age;
		this.name = name.length < 1 ? null : name[0];

	}

	public Movies() {

	}

	public static void main(String[] args) {

		Movies[] movies = { new Movies(4), new Movies(4) };

		System.out.println(Arrays.asList(movies));
		Arrays.sort(movies);

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
		Movies other = (Movies) obj;
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
	public int compareTo(Movies o) {
		// TODO Auto-generated method stub

		return this.age > o.age ? 1 : -1;
	}

}
