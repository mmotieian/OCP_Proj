package interfaces;

public class Task implements Processable {

	@Override
	public void processInSequence() {
		// TODO Auto-generated method stub
		System.out.println("Processing in sequence");
	}
	
	@Override
	public void ProcessInParallel() {
		// TODO Auto-generated method stub
		System.out.println("Task ProcessInParallel");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task = new Task();
		task.ProcessInParallel();
		
		Processable.log("Hello World");
	}

}
