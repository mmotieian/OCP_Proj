package ch4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import ch7.Car;

public class CollectionMain {

	public static void main(String[] args) {

		arrayList();
		// arrayQueue();
		// linkedList();
		// set();
		// linkedHashSet();
		// treeMap();
		// hashMap();
		// arraySort();
		listSort();

	}

	private static void listSort() {

		List<Integer> intList = new ArrayList<>();
		intList.add(4);
		intList.add(3);
		intList.add(7);
		intList.add(1);
		intList.add(6);

		Collections.sort(intList);
		System.out.println(intList);
		System.out.println(Collections.binarySearch(intList, 8));

	}

	private static void arraySort() {

		Car[] array = { new Car("Nohammad"), new Car("Najar") };

		Arrays.sort(array, new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				return o1.getStr().compareTo(o2.getStr());
			}
		});

		System.out.println(Arrays.asList(array));

	}

	private static void hashMap() {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(2, "A");
		hashMap.put(1, "B");

		for (String s : hashMap.values()) {
			System.out.println(s);
		}

		for (Integer i : hashMap.keySet())
			System.out.println(i + " " + hashMap.get(i));

		for (Map.Entry<Integer, String> m : hashMap.entrySet()) {
			System.out.println(m);
		}

	}

	private static void treeMap() {

		Map<Integer, Integer> treeMap = new TreeMap<>();
		// treeMap.put(null, null); <--- can't use NULL in a Tree structure

		Set<Car> set = new TreeSet<>();
		set.add(new Car()); // Comparable not implemented in Car()

	}

	private static void linkedHashSet() {
		Set<String> set = new LinkedHashSet<>();
		set.add("Mohammad");
		set.add("Fatemeh");

		List<String> extended = new ArrayList<>();
		extended.add("Hossna");
		extended.add("Leila");

		set.addAll(extended);

		for (String s : set) {
			System.out.println(s);
		}

	}

	private static void set() {
		Set<Integer> s = new HashSet<>();
		s.add(null);
		s.add(2);
		s.add(3);

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);

		s.addAll(list);

		for (Integer i : s) {
			System.out.println(i);
		}

	}

	private static void linkedList() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.offer(23);
		linkedList.add(null);
		linkedList.add(null);
		linkedList.add(2);
		linkedList.push(333);
		linkedList.remove(2);

		Iterator<Integer> iterator = linkedList.listIterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());

	}

	private static void arrayQueue() {
		Deque<Integer> deque = new ArrayDeque<>();
		deque.push(2);
		deque.push(3);
		deque.offerFirst(1);
		deque.offerLast(4);

		// 7 1 2 3 4
		// System.out.println(deque.peek());
		deque.push(7);

		System.out.println(deque.pollFirst());

		for (Integer i : deque) {
			System.out.println(i);
		}

	}

	private static void arrayList() {
		List l = new ArrayList<>();
		l.add("");
		// String sa = l.get(0); //<-- compile error

		List l2 = new ArrayList<String>();
		l2.add("");
		// String s = l2.get(0); //<-- compile error

		List l3 = new ArrayList();
		l3.add("");
		// s = l3.get(0); // <-- compile error

		List<String> l4 = new ArrayList(); // <-- GOOD
		l4.add("");
		String aa = l4.get(0);

		List<Integer> list = new ArrayList<>();
		list.add(1);

		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
	}

}
