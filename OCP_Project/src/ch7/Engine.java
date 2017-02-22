package ch7;

public class Engine {

	private int engineSize;

	public Engine() {

	}

	public Engine(int size) {
		this.engineSize = size;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		return "Engine [engineSize=" + engineSize + "]";
	}

}
