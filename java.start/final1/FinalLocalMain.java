package final1;

public class FinalLocalMain {
	public static void main(String[] args) {
		// final 지역 변수에 설정할 경우 최초 한번만 할당 가능
		final int data1;
		data1 = 10;
		// data1 = 20; 컴파일 오류 ( 최초 한번만 할당 가능)
		final int data2 = 10;
		method(10);

	}

	 static void method(final int parameter) {
		//parameter = 20; 컴파일 오류
	}

}
