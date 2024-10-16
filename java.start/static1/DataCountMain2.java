package static1;

public class DataCountMain2 {
	public static void main(String[] args) {
		// 내부에서 인스턴스를 생성할때는 호출할때마다 추가생성된다
		// 외부에서 인스턴스를 저장하면 증가하는 수는 외부에서 가져오기때문에 증가 가능하다
		Counter counter = new Counter();

		Data2 data1 = new Data2("A", counter);
		System.out.println("A count= " + counter.count);

		Data2 data2 = new Data2("B", counter);
		System.out.println("B count = " + counter.count);

		Data2 data3 = new Data2("C", counter);
		System.out.println("C count = " + counter.count);
	}
}
