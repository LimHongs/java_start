package final1;

public class FinalRefMain {

	public static void main(String[] args) {
		final Data data = new Data();
		//data = new Data(); // final 변경 불가 컴파일 오류

		data.value = 10;
		System.out.println(data.value);
		data.value = 20;
		System.out.println(data.value);
	}

}
