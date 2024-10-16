package memory;

public class Data3 {
	public String name;
	public static int count;

	public Data3(String name) {
		this.name = name;
		count++;
	}
	// static 이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용할수있다 인스턴스 변수는 인스턴스를 만들 때마다 새로 만들어진다.
	// 클래스 변수 ,정적 변수 , static이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근이 가능
}
