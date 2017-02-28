
public class NoPackagedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(NoPackagedClass.class);
		
		String str = "Hello";
		String str2 = "Hello";
		
		
		
		System.out.println(str == str2);
		
		String str3 = "hello";
		str = "hello";
		
		System.out.println(str == str3);
		
		
		System.out.println(str);
		changeString(str);
		System.out.println(str);
		
		System.out.println("---------------------");
		
		StringBuilder sb = new StringBuilder("HELLO");
		System.out.println(sb);
		changeStringBuilder(sb);
		System.out.println(sb);
		
	}
	
	private static void changeString(String str){
		str += "asdlfkjsa";
	}
	
	private static void changeStringBuilder(StringBuilder sb){
		StringBuilder sb2 = new StringBuilder("asdfdsfas");
		System.out.println(10+10+sb2.toString());
		sb = sb2;
	}

}
