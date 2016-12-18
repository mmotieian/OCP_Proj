package ch4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();
		map.put(22, "Twenty Two");
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(222, "Twenty Two");
		map.put(12, "One");
		map.put(21, "Two");
		map.put(31, "Three");
		

		System.out.println(map);

		Map<Integer, String> map2 = new TreeMap<>(map);
		
		System.out.println(map2);
		
		Map<Integer, String> map3 = new LinkedHashMap<>();
		map3.put(22, "Twenty Two");
		map3.put(1, "One");
		map3.put(2, "Two");
		map3.put(3, "Three");
		map3.putAll(map);
		System.out.println(map3);
		
		for(String str : map3.values())
			System.out.print(str + ", ");
		
//		for(Set<Integer, String> obj : map3.entrySet())
//			System.out.println(obj);
//		
		

	}

}
