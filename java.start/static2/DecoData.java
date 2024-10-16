package static2;

public class DecoData {
	private int instanceValue;
	private static int staticValue;

	public static void statcCall() {
		staticValue++;
		staticMethod();
	}

	public void instranceCall() {
		instanceValue++;
		instanceMethod();

		staticValue++;
		staticMethod();
	}


	private void instanceMethod() {
		System.out.println("instanceValue=" + instanceValue);
	}

	private static void staticMethod() {
		System.out.println("staticValue=" + staticValue);
	}

}
