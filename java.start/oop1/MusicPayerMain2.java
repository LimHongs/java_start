package oop1;

public class MusicPayerMain2 {
	/*
	 *	절차 지향 프로그래밍 : 프로그램의 흐름을 순차적으로 따르며 처리하는 방식
	 *	객체 지향 프로그래밍 : 객체들 간의 상호작용을 중요시 하는 프로그래밍 방식
	 * */
	public static void main(String[] args) {

		MusicPlayerData data = new MusicPlayerData();

		//음악 플레이어 켜기
		data.isOn = true;
		System.out.println("음악 플레이어를 시작합니다");

		//불륨증가
		data.volume++;
		System.out.println("음악 플레이어 볼륨:" + data.volume);
		data.volume++;
		System.out.println("음악 플레이어 볼륨:" + data.volume);

		data.volume--;
		System.out.println("음악 플레이어 볼륨:" + data.volume);

		//음악 플레이어 상태
		System.out.println("음악 플레이어 상태 확인");
		if(data.isOn) {
			System.out.println("음악 플레이어 On 불륨: "+ data.volume);
		}else {
			System.out.println("음악 플레이어 OFF");
		}

		data.isOn = false;
		System.out.println("음악 플레이어를 종료합니다");

	}

}
