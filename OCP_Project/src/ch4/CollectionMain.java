package ch4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
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

		// arrayList();
		// arrayQueue();
		// linkedList();
		// set();
		// linkedHashSet();
		treeMap();

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
		List<Integer> list = new ArrayList<>();
		list.add(1);

		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());
	}

}
