package ch2;

import java.util.concurrent.atomic.AtomicInteger;

public enum SimpleEnum {

	ONE, TWO;

	private String getThis() {
		return "THIS";
	}

	private String getThat() {
		return "THAT";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AtomicInteger ai = new AtomicInteger(4);
		ai.addAndGet(3);
		
		System.out.println(ai.toString());
	}
}
