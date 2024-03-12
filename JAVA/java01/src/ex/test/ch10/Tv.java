package ex.test.ch10;

public class Tv {

	static int[] chValue = new int[10];
	static {
		System.out.println("정적 초기화 블록 시작");
		for (int i = 0; i < chValue.length; i++) {
			chValue[i] = (int) (Math.random() * 30) + 1;
			// 중복 값 처리
			for (int y = 0; y < i; y++) {
				if (chValue[y] == chValue[i]) {
					i--;
					break;
				}

			}
		}

		// chValue 정렬
		for (int i = 0; i < chValue.length; i++) {
			boolean changed = false;

			for (int j = 0; j < chValue.length - 1 - i; j++) {
				if (chValue[j] > chValue[j + 1]) {
					int temp = chValue[j];
					chValue[j] = chValue[j + 1];
					chValue[j + 1] = temp;
					changed = true;
				}
			}

			if (!changed)
				break;

		}
		System.out.println("정적 초기화 블록 완료. chValue 배열:");
		 for (int k = 0; k < chValue.length; k++) {
		        System.out.print(chValue[k] + " ");
		    }
		    System.out.println();

	}
	int channel;
	boolean power;
	int chIndex = 0;

	Tv() {
		channel = 1;
	}

	Tv(int ch) {
		this.channel = ch;
	}

	public void view() {
		System.out.println("ch :" + chValue[chIndex]);
	}

	public void channelUp() {
		if (chIndex == (chValue.length - 1)) {
			chIndex = 0;
		} else {
			chIndex++;
		}
	}

	public void channelDown() {
		if (power) {
			if (chIndex == 0) {
				chIndex = chValue.length - 1;
			} else {
				chIndex--;
			}
		}
	}

	public void channelChange(int ch) {
		boolean result = false;
		for (int i = 0; i < chValue.length; i++) {
			if (chValue[i] == ch) {
				chIndex = i;
				result = true;
			}
			if (!result) {
				System.out.println("없는 채널");
			}
		}
	}

	public void powerChange() {
		power = !power;
		if (power) {
			System.out.println("Tv on");
		}
	}

	// 1.채널 중복된 번호 제거
	// 2.channelUp(), channelDown - chValue 대입된 채널로 이동한다.
	// 3.channelChange(int ch) - 해당 채널이 있으면 이동 없으면 없는 채널
	// 4.view() - 현재 채널을 출력
	// 5.모든 기능은 전원 켜져있을때 동작한다
}
