package interfaces;

@FunctionalInterface interface Processable extends Parallelizable{
	void processInSequence();

	@Override
	String toString();
	
	
	default void ProcessInParallel() {
		System.out.println("Processing in Parallel");
	}

	static void log(String s) {
		System.out.println("Logging: " + s);
	}
}
