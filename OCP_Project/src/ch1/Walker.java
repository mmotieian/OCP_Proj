package ch1;

public class Walker {

	protected double elevation;
	protected int distance;

	int move(int data) {
		return distance += data;
	}
	
	protected static void getWalkerInfo(Walker w){
		System.out.println(w.distance);
	}
	
	
	//	UphillHiker w = new UphillHiker();
	//	w.move(10);
	//	w.getWalkerInfo(w);
    //
	//	Walker w2 = new UphillHiker();
	//	w2.move(10);
	//	w2.getWalkerInfo(w2);
	//	
	//	Walker w3 = new Walker();
	//	w3.move(10);
	//	w3.getWalkerInfo(w3);
	//	
	//	Walker w4 = new Walker();
	//	w4.move(10);
	//	UphillHiker.getWalkerInfo(w4);
}
