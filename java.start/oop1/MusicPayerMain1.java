package oop1;

public class MusicPayerMain1 {
	/*
	 *	절차 지향 프로그래밍 : 프로그램의 흐름을 순차적으로 따르며 처리하는 방식
	 *	객체 지향 프로그래밍 : 객체들 간의 상호작용을 중요시 하는 프로그래밍 방식
	 * */
	public static void main(String[] args) {
		int volume = 0;
		boolean isOn = false;

		//음악 플레이어 켜기
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다");

		//불륨증가
		volume++;
		System.out.println("음악 플레이어 볼륨:" + volume);
		volume++;
		System.out.println("음악 플레이어 볼륨:" + volume);

		volume--;
		System.out.println("음악 플레이어 볼륨:" + volume);

		//음악 플레이어 상태
		System.out.println("음악 플레이어 상태 확인");
		if(isOn) {
			System.out.println("음악 플레이어 On 불륨: "+ volume);
		}else {
			System.out.println("음악 플레이어 OFF");
		}

		isOn = false;
		System.out.println("음악 플레이어를 종료합니다");

	}
}
