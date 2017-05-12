package review;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
	}

	private static int[] arrayLeftRotation(int[] a, int n, int k) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new ArrayDeque<>();
		
		for(int elem : a){
			q.add(elem);
		}
		
		for(int i = 0 ; i < k ; i++){
			q.add(q.poll());
		}
		
		int[] b = new int[n];
		for(int i = 0 ; i < n ; i++){
			b[i] = q.poll();
		}
		
		return b;
	}

}
