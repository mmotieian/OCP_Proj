package ch5;

public class SubSeqString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is Mohammad Mahdi Motieian";
		
		String subSeq = str.subSequence(0, 6).toString();
		String subStr = str.substring(0, 6);
		
		
		System.out.printf("%s\n%s", subSeq, subStr);
	}

}
