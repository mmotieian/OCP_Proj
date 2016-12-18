package ch1;

public class UphillHiker extends Walker {
	public double elevation;

	@Override
	public int move(int data) {
		elevation += 0.5;
		return distance += data;
	}

	public static void getWalkerInfo(UphillHiker w) {
		System.out.println(w.distance + "-" + w.elevation);
	}
}
