package access;

public class Speaker {
	private int Volume;

	Speaker(int volume) {
		this.Volume = volume;
	}

	void volumeUp() {
		if (Volume >= 100) {
			System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
		}else {
			Volume += 10;
			System.out.println("음량을 10 증가합니다.");
		}
	}

	void volumeDown() {
		Volume -= 10;
		System.out.println("volumeDown 호출");
	}

	void showVolume() {
		System.out.println("현재 음량:" + Volume );
	}
}
