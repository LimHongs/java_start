package oop1;

public class MusicPlayerMain4 {
	public static void main(String[] args) {
		MusicPlayer player = new MusicPlayer();
		// 음악 플레이어 켜기
		player.on();

		// ++
		player.volumeUp();

		// ++
		player.volumeUp();

		//--
		player.volueDown();

		// status
		player.showStatus();
		// off
		player.off();
	}
}
