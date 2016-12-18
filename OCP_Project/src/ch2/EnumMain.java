package ch2;

public enum EnumMain {

	
	EASY("Easy") {
		@Override
		public void doSomthing() {
			// TODO Auto-generated method stub

		}
	},
	INTERMEDIATE("Intermediate") {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "It's moderately easy";
		}

		@Override
		public void doSomthing() {
			// TODO Auto-generated method stub

		}
	},
	HARD("Hard") {
		@Override
		public void doSomthing() {
			// TODO Auto-generated method stub
			num = 2;
		}
	};

	public int num = 3;
	
	private String color;

	public String getColor() {
		return color;
	}

	EnumMain(String color) {
		this.color = color;
	}

	public abstract void doSomthing();

	public void doSomthing2() {

	}

	public static void main(String[] args) {

	}

}
