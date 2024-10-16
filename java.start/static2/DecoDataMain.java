package static2;
import static static2.DecoData.*;

public class DecoDataMain {
	public static void main(String[] args) {
		// static 정적 매소드는 클래스 이름을 바로 호출할수있다.
		// insetrance는 기능을 사용할려면 참조값을 알아야한다 참조값을 직접 매개변수로 전달할려면 메서드나 인스턴스 변수를 통해 메서드를 호출가능
		// 인스턴스 메서드 : static이 붙지 않은 멤버메서드
		// 클래스 메서드 : static이 붙은 멤버 메서드 (클래스 메서드 ,정적메서드 ,static메서드라고 불린다)


		System.out.println("1.정적호출");
		//DecoData data1 = new DecoData();
		//data1.statcCall();
		DecoData.statcCall();

		System.out.println("2.인스턴스 호출 1");
		DecoData data1 = new DecoData();
		data1.instranceCall();

		System.out.println("3.인스턴스 호출 2");
		DecoData data2 = new DecoData();
		data2.instranceCall();

		DecoData data3 = new DecoData();
		data3.statcCall();

		DecoData.statcCall();


	}
}
