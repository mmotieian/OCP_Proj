package com.amazon.main;

import java.util.ArrayList;
import java.util.List;

public class Interview {

	public static void main(String[] str) {
		System.out.println("Hello World");
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int a = 1000 ; a > 0 ; a--){
			list.add((int)(1000*Math.random()));
//			list.add(a);
		}
		
		System.out.println(returnSmallestKElements(list, 20));
	}
	
	

    // accept List of size n
    // accept K 
    // return List of size K containing K smallest values
    public static List<Integer> returnSmallestKElements(ArrayList<Integer> elems, int K){
        List<Integer> smallestKElems = new ArrayList<Integer>();
        
        // O(n log n)
        // O(K)
        
        // K << n 
        //------------------
        //1st smallest --> list
        //2nd smallest
        //...
        //Kth smallest
        int smallest0 = elems.get(0);
        int origSize = elems.size();
        // 5 4 3 2 1
//       O(n)xO(K)
        for( int iter = 0 ; iter < K ; iter++){
            // 1st smallest
            for(int j = 0 ; j < origSize ; j++ ){
               // if smallestKElems size is less than K { ... }
                if(smallest0 > elems.get(j)  && !smallestKElems.contains(elems.get(j))){
                    smallest0 = elems.get(j);
                    
                }
            }
            smallestKElems.add(smallest0);
            smallest0 = elems.get(0);
        }
           
        
        
        return smallestKElems;
    }

}
