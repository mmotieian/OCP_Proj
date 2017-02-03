package ch5;

public class Replace_ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "cat cup copp";
//		String newStr = str.replaceAll("c.p\\b", "()");
		String newStr = str.replace("c.p", "()");
		System.out.println(newStr);
		
	}

}
